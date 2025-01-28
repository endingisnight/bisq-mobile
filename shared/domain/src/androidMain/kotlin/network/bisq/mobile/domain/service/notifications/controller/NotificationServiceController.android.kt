package network.bisq.mobile.domain.service.notifications.controller

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.core.app.NotificationCompat
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import network.bisq.mobile.domain.service.AppForegroundController
import network.bisq.mobile.domain.service.BisqForegroundService
import network.bisq.mobile.domain.utils.Logging

/**
 * Controller interacting with the bisq service
 */
@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual class NotificationServiceController (private val appForegroundController: AppForegroundController): ServiceController, Logging {

    private val context = appForegroundController.context

    companion object {
        const val SERVICE_NAME = "Bisq Service"
    }

    private val serviceScope = CoroutineScope(SupervisorJob())
    private val observerJobs = mutableMapOf<StateFlow<*>, Job>()
    private var isRunning = false

    var activityClassForIntents = context::class.java
    var defaultDestination = "tab_my_trades" // TODO minor refactor move this hardcode out of here and into client leaf code    }

    /**
     * Starts the service in the appropiate mode based on the current device running Android API
     */
    actual override fun startService() {
        if (isRunning) {
            log.w { "Service already running, skipping start call" }
        } else {
            log.i { "Starting Bisq Service.."}
            createNotificationChannel()
            val intent = Intent(context, BisqForegroundService::class.java)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                log.i { "OS supports foreground service" }
                context.startForegroundService(intent)
            } else {
                // if the phone does not support foreground service
                context.startService(intent)
            }
            isRunning = true
            log.i { "Started Bisq Service"}
        }
    }

    // TODO provide an access for this
    actual override fun stopService() {
        // TODO we need to leave the service running if the user is ok with it
        if (isRunning) {
            deleteNotificationChannel()
            val intent = Intent(context, BisqForegroundService::class.java)
            context.stopService(intent)
            isRunning = false
        } else {
            log.w { "Service is not running, skipping stop call" }
        }
    }

    actual override fun <T> registerObserver(stateFlow: StateFlow<T>, onStateChange: (T) -> Unit) {
        if (observerJobs.contains(stateFlow)) {
            log.w { "State flow observer already registered, skipping registration" }
        }
        val job = serviceScope.launch {
            stateFlow.collect {
                onStateChange(it)
            }
        }
        observerJobs[stateFlow] = job
    }

    actual override fun unregisterObserver(stateFlow: StateFlow<*>) {
        observerJobs[stateFlow]?.cancel()
        observerJobs.remove(stateFlow)
    }

    // TODO support for on click and decide if we block on foreground
    actual fun pushNotification(title: String, message: String) {
        if (isAppInForeground()) {
            log.w { "Skipping notification since app is in the foreground" }
            return
        }

        // Create an intent that brings the user back to the app
        val intent = Intent(context, activityClassForIntents).apply {
            flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
//            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
            putExtra("destination", defaultDestination) // Add extras to navigate to a specific screen
        }

        // Create a PendingIntent to handle the notification click
        val pendingIntent = PendingIntent.getActivity(
            context,
            0,
            intent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE // FLAG_IMMUTABLE is required on Android 12+
        )
        val notificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        val notification = NotificationCompat.Builder(context, BisqForegroundService.CHANNEL_ID)
            .setContentTitle(title)
            .setContentText(message)
            .setSmallIcon(android.R.drawable.ic_notification_overlay)
            .setPriority(NotificationCompat.PRIORITY_DEFAULT) // For android previous to O
//            .setOngoing(true)
            .setAutoCancel(true)
            .setContentIntent(pendingIntent)
            .build()
        notificationManager.notify(BisqForegroundService.PUSH_NOTIFICATION_ID, notification)
        log.d {"Pushed notification: $title: $message" }
//        }
    }

    actual override fun isServiceRunning() = isRunning

    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(BisqForegroundService.CHANNEL_ID, SERVICE_NAME, NotificationManager.IMPORTANCE_LOW)
            val manager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            manager.createNotificationChannel(channel)
        }
    }

    private fun deleteNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val manager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            manager.deleteNotificationChannel(BisqForegroundService.CHANNEL_ID)
        }
    }

    actual fun isAppInForeground(): Boolean {
        return appForegroundController.isForeground.value
    }

}