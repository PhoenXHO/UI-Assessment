package com.test.technicalassessment.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import com.test.technicalassessment.ui.theme.Dimensions

@Composable
fun RoundedSurface(
    modifier: Modifier = Modifier,
    contentAlignment: Alignment = Alignment.Center,
    padding: Dp = Dimensions.defaultPadding,
    backgroundColor: Color = MaterialTheme.colorScheme.surface,
    radius: Dp = Dimensions.radiusExtraLarge,
    content: @Composable () -> Unit,
) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(radius))
            .background(backgroundColor)
            .padding(padding),
        contentAlignment = contentAlignment,
    ) { content() }
}