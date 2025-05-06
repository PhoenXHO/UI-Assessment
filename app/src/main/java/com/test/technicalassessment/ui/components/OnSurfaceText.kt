package com.test.technicalassessment.ui.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle

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