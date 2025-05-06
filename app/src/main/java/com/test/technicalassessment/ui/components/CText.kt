package com.test.technicalassessment.ui.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle

@Composable
fun CText(
    text: String,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = MaterialTheme.typography.bodyLarge,
    color: Color = MaterialTheme.colorScheme.onBackground,
) {
    androidx.compose.material3.Text(
        text = text,
        color = color,
        modifier = modifier,
        fontSize = textStyle.fontSize,
        fontWeight = textStyle.fontWeight,
        lineHeight = textStyle.lineHeight,
        letterSpacing = textStyle.letterSpacing,
        fontFamily = textStyle.fontFamily,
    )
}