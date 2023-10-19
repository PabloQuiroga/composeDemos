package com.siar.composedemos.views.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.siar.composedemos.ui.theme.ComposeDemosTheme
import com.siar.composedemos.views.data.Message
import com.siar.composedemos.views.data.SampleData

@Composable
fun Conversation(
    messages: List<Message>
) {
    LazyColumn{
        items(messages) {message ->
            MessageCard(msg = message)
        }
    }
}

@Preview(
    name = "Light mode",
    showBackground = true
)
@Composable
fun ConveresationPreview(){
    ComposeDemosTheme {
        Conversation(SampleData.conversationSample)
    }
}