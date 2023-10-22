package com.siar.composedemos.views.components

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.siar.composedemos.ui.theme.ComposeDemosTheme

@Composable
fun OnboardingScreen(
    modifier: Modifier = Modifier,
    onContinue: () -> Unit
) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Welcome to Basics Codelab!")
        Button(
            modifier = Modifier.padding(vertical = 24.dp),
            onClick = onContinue
        ) {
            Text(text = "Continue")
        }
    }
}

@Preview(
    name = "Dark", uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true, widthDp = 320, heightDp = 480
)
@Preview(
    showBackground = true, widthDp = 320, heightDp = 480
)
@Composable
fun OnboardingPreview(){
    ComposeDemosTheme {
        OnboardingScreen(onContinue = {})
    }
}