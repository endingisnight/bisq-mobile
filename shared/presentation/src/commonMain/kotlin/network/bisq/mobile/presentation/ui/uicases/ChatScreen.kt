package network.bisq.mobile.presentation.ui.uicases

import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import kotlinx.coroutines.launch
import network.bisq.mobile.presentation.ui.components.layout.BisqStaticScaffold
import network.bisq.mobile.presentation.ui.components.molecules.TopBar
import network.bisq.mobile.presentation.ui.components.molecules.chat.BisqChatInputField
import network.bisq.mobile.presentation.ui.components.organisms.chat.ChatWidget
import network.bisq.mobile.presentation.ui.composeModels.ChatMessage
import network.bisq.mobile.presentation.ui.composeModels.ChatMessageReplyOf
import org.koin.compose.koinInject

@Composable
fun ChatScreen() {
    var chatText by remember { mutableStateOf("") }
    val scrollState = rememberLazyListState()
    val scope = rememberCoroutineScope() // TODO: How scopes are to be used?
    val presenter: ChatPresenter = koinInject()
    val messages by presenter.messages.collectAsState()
    var quotedMessage by remember {
        mutableStateOf<ChatMessage?>(null)
    }

    BisqStaticScaffold(
        topBar = { TopBar(title = "Chat - 07b9bab1") },
    ) {
        ChatWidget(
            messages = messages,
            modifier = Modifier.weight(1f),
            scrollState = scrollState,
            onQuoteMessage = { quotedMessage = it }
        )
        BisqChatInputField(
            value = chatText,
            placeholder = "Type a new message",
            onValueChanged = { chatText = it },
            onMessageSent = { inputText, message ->
                chatText = ""
                presenter.addMessage(
                    ChatMessage(
                        messageID = (messages.size * 10).toString(),
                        "me",
                        inputText,
                        timestamp = "8.00PM", //TODO:
                        reaction = "",
                        chatMessageReplyOf = if (quotedMessage == null) null else ChatMessageReplyOf(
                            messageID = quotedMessage!!.messageID,
                            author = quotedMessage!!.author,
                            content = quotedMessage!!.content
                        )
                    )
                )
                scope.launch {
                    scrollState.animateScrollToItem(0)
                    quotedMessage = null
                }
            },
            quotedMessage = quotedMessage,
            onCloseReply = { quotedMessage = null },
        )
    }
}
