package com.sahalnazar.composebaseproject.ui.theme

import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color

val Black100 = Color(0xFF121212)
val Black200 = Color(0xFF303030)
val Gray300 = Color(0xFF949494)
val Gray400 = Color(0xFFE7E7E7)
val Red100 = Color(0xFFD8605D)


val DarkColorPalette = darkColors(
    primary = Black100,
    onPrimary = Color.White,

    secondary = Gray400,
    onSecondary = Black200,

    surface = Color.White,
    onSurface = Gray300,

    onError = Red100
)

val LightColorPalette = lightColors(
    primary = Black100,
    onPrimary = Color.White,

    secondary = Gray400,
    onSecondary = Black200,

    surface = Color.White,
    onSurface = Gray300,

    onError = Red100
)