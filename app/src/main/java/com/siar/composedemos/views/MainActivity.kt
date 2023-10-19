package com.siar.composedemos.views

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.siar.composedemos.ui.theme.ComposeDemosTheme
import com.siar.composedemos.views.components.Conversation
import com.siar.composedemos.views.data.SampleData

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemosTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    Conversation(messages = SampleData.conversationSample)
                }
            }
        }
    }
}
