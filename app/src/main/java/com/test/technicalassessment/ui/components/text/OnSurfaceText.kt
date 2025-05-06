package com.test.technicalassessment.ui.components.text

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle

/**
 * OnSurfaceText is a composable function that displays text with the color set to `onSurface`.
 * This is used just to avoid having to set the color every time we need to display text on a surface.
 *
 * @param text The text to be displayed.
 * @param modifier Modifier to be applied to the text.
 * @param textStyle The style to be applied to the text. Default is `MaterialTheme.typography.bodyLarge`.
 *
 * @see CText
 */
@Composable
fun OnSurfaceText(
    text: String,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = MaterialTheme.typography.bodyLarge,
) {
    CText(
        text = text,
        color = MaterialTheme.colorScheme.onSurface,
        modifier = modifier,
        textStyle = textStyle,
    )
}