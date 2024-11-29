package network.bisq.mobile.android.node.utils

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Paint
import network.bisq.mobile.utils.Logging
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.FileOutputStream
import java.io.IOException

/**
 * Android images utilitary functions
 */
object ImageUtil: Logging {

    fun composeImage(context: Context, paths: Array<String>, width: Int, height: Int): Bitmap {
        val resultBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(resultBitmap)
        val paint = Paint()

        paths.forEach { path ->
            val bitmap = getImageByPath(context, path)
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0f, 0f, paint)
            }
        }

        return resultBitmap
    }

    fun readRawImage(file: File): Bitmap? {
        return try {
            val byteArray = file.readBytes()
            byteArrayToBitmap(byteArray)
        } catch (e: IOException) {
            e.printStackTrace()
            null
        }
    }

    fun writeRawImage(image: Bitmap, file: File) {
        try {
            val byteArray = bitmapToByteArray(image)
            FileOutputStream(file).use { it.write(byteArray) }
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    internal fun getImageByPath(context: Context, path: String): Bitmap? {
        return try {
            log.d { "opening file in path $path"}
            val inputStream = context.assets.open(path)
            BitmapFactory.decodeStream(inputStream)
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    internal fun bitmapToByteArray(bitmap: Bitmap): ByteArray {
        val outputStream = ByteArrayOutputStream()
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream)
        return outputStream.toByteArray()
    }

    internal fun byteArrayToBitmap(data: ByteArray): Bitmap? {
        val inputStream = ByteArrayInputStream(data)
        return BitmapFactory.decodeStream(inputStream)
    }
}