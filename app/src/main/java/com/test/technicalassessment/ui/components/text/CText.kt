package com.test.technicalassessment.ui.components.text

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle

/**
 * CText is a composable function that displays text with customizable styles and colors.
 *
 * @param text The text to be displayed.
 * @param modifier Modifier to be applied to the text.
 * @param textStyle The style to be applied to the text. Default is `MaterialTheme.typography.bodyLarge`.
 * @param color The color of the text. Default is `MaterialTheme.colorScheme.onBackground`.
 */
@Composable
fun CText(
    text: String,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = MaterialTheme.typography.bodyLarge,
    color: Color = MaterialTheme.colorScheme.onBackground,
) {
    Text(
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