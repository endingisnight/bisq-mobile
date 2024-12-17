package network.bisq.mobile.presentation.ui

import androidx.compose.runtime.*
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import cafe.adriel.lyricist.ProvideStrings
import cafe.adriel.lyricist.rememberStrings
import org.jetbrains.compose.ui.tooling.preview.Preview

import kotlinx.coroutines.flow.StateFlow
import network.bisq.mobile.presentation.ViewPresenter
import network.bisq.mobile.presentation.ui.components.SwipeBackIOSNavigationHandler
import network.bisq.mobile.presentation.ui.helpers.RememberPresenterLifecycle
import org.koin.compose.koinInject

import network.bisq.mobile.presentation.ui.navigation.graph.RootNavGraph
import network.bisq.mobile.presentation.ui.theme.BisqTheme

interface AppPresenter : ViewPresenter {
    var navController: NavHostController

    var tabNavController: NavHostController

    // Observables for state
    val isContentVisible: StateFlow<Boolean>

    // Actions
    fun toggleContentVisibility()

    fun isIOS(): Boolean
}

/**
 * Main composable view of the application that platforms use to draw.
 */
@Composable
@Preview
fun App() {

    val rootNavController = rememberNavController()
    val tabNavController = rememberNavController()
    var isNavControllerSet by remember { mutableStateOf(false) }
    val presenter: AppPresenter = koinInject()

    RememberPresenterLifecycle(presenter, {
        presenter.navController = rootNavController
        presenter.tabNavController = tabNavController
        isNavControllerSet = true
    })

    val lyricist = rememberStrings()

    BisqTheme(darkTheme = true) {
        ProvideStrings(lyricist) {
            if (isNavControllerSet) {
                SwipeBackIOSNavigationHandler(rootNavController) {
                    RootNavGraph(rootNavController)
                }
            }
        }
    }

}