package com.example.instagram.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.example.instagram.R

val instagramFont = FontFamily(Font(R.font.billabong))

fun typography(onBackground: Color): Typography {
    return Typography(
        bodyLarge = TextStyle(
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.Normal,
            fontSize = fontSmall,
            color = onBackground
        ),
        headlineLarge = TextStyle(
            fontFamily = instagramFont,
            fontWeight = FontWeight.Normal,
            fontSize = fontXXLarge,
            color = onBackground
        )
    )
}