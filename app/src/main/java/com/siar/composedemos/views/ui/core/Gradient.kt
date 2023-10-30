package com.siar.composedemos.views.ui.core

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
private fun verticalGradient(colors: List<Color>): Brush{
    return Brush.verticalGradient(colors = colors)
}

@Composable
private fun radialGradient(colors: List<Color>): Brush{
    return Brush.radialGradient(colors = colors)
}

/**
 * Preview area starts here
 */

@Preview(
    name = "VerticalGradient",
    showBackground = true, widthDp = 320, heightDp = 480
)
@Composable
fun GradientVerticalPreview(){
    val brush = verticalGradient(
        colors = listOf(
            Color(0xFF2be4dc),
            Color(0xFF243484)
        )
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(brush)
    )
}

@Preview(
    name = "RadialGradient",
    showBackground = true, widthDp = 320, heightDp = 480
)
@Composable
fun GradientRadialPreview(){
    val brush = radialGradient(
        colors = listOf(
            Color(0xFF2be4dc),
            Color(0xFF243484)
        )
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(brush)
    )
}