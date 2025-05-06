package com.test.technicalassessment.ui.components.surfaces

import androidx.compose.foundation.background
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

/**
 * RoundedSurface is a composable function that displays a rounded surface with customizable
 * properties such as padding, background color, and corner radius.
 *
 * @param modifier Modifier to be applied to the surface.
 * @param contentAlignment Alignment of the content inside the surface. Default is `Alignment.Center`.
 * @param padding Padding to be applied inside the surface. Default is `Dimensions.defaultPadding`.
 * @param backgroundColor Background color of the surface. Default is `MaterialTheme.colorScheme.surface`.
 * @param radius Corner radius of the surface. Default is `Dimensions.radiusExtraLarge`.
 * @param content Composable content to be displayed inside the surface.
 *
 * @see androidx.compose.foundation.shape.RoundedCornerShape
 */
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
			// Apply rounded corners first to ensure the background color is clipped correctly
            .clip(RoundedCornerShape(radius))
            .background(backgroundColor)
            .padding(padding),
        contentAlignment = contentAlignment,
    ) { content() }
}