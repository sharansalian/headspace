package io.sharan.headspace.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = Orange,
    secondary = Blue,
    surface = Color.White,
    background = Color.White
)

private val LightColorPalette = lightColors(
    primary = Orange,
    primaryVariant = Orange,
    secondary = Blue,
    secondaryVariant = Blue,
    surface = Color.White,
    background = Color.White,
    onSurface = Color.Black,
    onBackground = Color.Black,
    onPrimary = Color.White,
    onSecondary = Color.White
)

@Composable
fun HeadspaceTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}

