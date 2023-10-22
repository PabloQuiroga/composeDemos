package com.siar.composedemos.views.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.siar.composedemos.ui.theme.ComposeDemosTheme

@Composable
fun MyApp(
    modifier: Modifier = Modifier
){
    var shouldShow by remember { mutableStateOf(true) }

    if (shouldShow) {
        OnboardingScreen(
            onContinue = { shouldShow = false }
        )
    }else{
        Greetings()
    }
}

@Preview(showBackground = true, widthDp = 320)
@Composable
fun MyAppPreview() {
    ComposeDemosTheme {
        MyApp(modifier = Modifier.fillMaxSize())
    }
}