package com.siar.composedemos.views.components

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.siar.composedemos.ui.theme.ComposeDemosTheme

@Composable
fun Greetings(
    modifier: Modifier = Modifier,
    names: List<String> = List(1000){ "$it" }
) {
    LazyColumn(
        modifier = modifier.padding(vertical = 4.dp)
    ) {
        items(items = names){ name ->
            Greeting(name = name)
        }
    }
}

@Preview(
    name = "Dark", uiMode = UI_MODE_NIGHT_YES,
    showBackground = true, widthDp = 320, heightDp = 480
)
@Preview(showBackground = true, widthDp = 320, heightDp = 480)
@Composable
fun GreetingsPreview() {
    ComposeDemosTheme {
        Greetings()
    }
}