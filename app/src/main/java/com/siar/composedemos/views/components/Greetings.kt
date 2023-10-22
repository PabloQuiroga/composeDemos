package com.siar.composedemos.views.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.siar.composedemos.ui.theme.ComposeDemosTheme

@Composable
fun Greetings(
    modifier: Modifier = Modifier,
    names: List<String> = listOf("World", "Compose")
) {
    Column(
        modifier = modifier.padding(vertical = 4.dp)
    ) {
        for (name in names) {
            Greeting(name = name)
        }
    }
}

@Preview(showBackground = true, widthDp = 320)
@Composable
fun GreetingsPreview() {
    ComposeDemosTheme {
        Greetings()
    }
}