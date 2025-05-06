package com.test.technicalassessment.ui.components.inputs

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.test.technicalassessment.ui.components.text.CText
import com.test.technicalassessment.ui.theme.Dimensions
import com.test.technicalassessment.ui.theme.PreviewTheme

/**
 * PrimaryButton is a customizable button component with a gradient background and optional prefix/suffix icons.
 *
 * @param text The text to be displayed on the button.
 * @param modifier Modifier to be applied to the button.
 * @param prefix Optional composable for a prefix icon or content.
 * @param suffix Optional composable for a suffix icon or content.
 * @param textStyle Text style for the button text. Default is `MaterialTheme.typography.titleMedium`.
 * @param borderWidth Width of the border around the button. Default is `6.dp`.
 * @param enabled Indicates whether the button is enabled or disabled. Default is `true`.
 * @param verticalPadding Vertical padding inside the button. Default is `Dimensions.defaultPadding`.
 * @param horizontalPadding Horizontal padding inside the button. Default is `Dimensions.defaultPadding`.
 * @param onClick Callback function to be invoked when the button is clicked.
 */
@Composable
fun PrimaryButton(
    text: String,
    modifier: Modifier = Modifier,
    prefix: @Composable (() -> Unit)? = null,
    suffix: @Composable (() -> Unit)? = null,
    textStyle: TextStyle = MaterialTheme.typography.titleMedium,
    borderWidth: Dp = 6.dp,
    enabled: Boolean = true,
    verticalPadding: Dp = Dimensions.defaultPadding,
    horizontalPadding: Dp = Dimensions.defaultPadding,
    onClick: () -> Unit,
) {
    val gradientBrush = Brush.linearGradient(
        colors = listOf(
            MaterialTheme.colorScheme.primaryContainer,
            MaterialTheme.colorScheme.primary,
        ),
        start = Offset(0f, 0f), // Top-left
        end = Offset(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), // Bottom-right
    )
    val disabledBrush = Brush.horizontalGradient(
        colors = listOf(Color.Gray, Color.DarkGray),
    )
    val textColor = if (enabled) {
        MaterialTheme.colorScheme.onPrimary
    } else {
        MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.3f)
    }

    val backgroundBrush = if (enabled) gradientBrush else disabledBrush
    val borderColor = if (enabled) {
        MaterialTheme.colorScheme.primary.copy(alpha = 0.3f)
    } else {
        Color.Gray
    }

    Box(
        modifier = modifier
			// The order of these modifiers is important
            .border(
                width = borderWidth,
                color = borderColor,
                shape = CircleShape,
            )
			.padding(borderWidth) // Padding to account for the border (pushes the content inside)
            .clip(CircleShape)
            .background(brush = backgroundBrush)
            .clickable(enabled = enabled, onClick = onClick)
            .padding(
                vertical = verticalPadding,
                horizontal = horizontalPadding,
            ),
        contentAlignment = Alignment.Center,
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
        ) {
            prefix?.invoke()
            CText(
                text = text,
                color = textColor,
                textStyle = textStyle,
            )
            suffix?.invoke()
        }
    }
}

@Preview
@Composable
fun PrimaryButtonPreview() {
    PreviewTheme { // Wrap preview in your theme
        Column(Modifier.padding(16.dp)) {
            PrimaryButton(
                text = "Click Me",
                prefix = {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                        contentDescription = "Arrow",
                        tint = Color.White,
                        modifier = Modifier.padding(end = Dimensions.marginMedium)
                    )
                },
                suffix = {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "Arrow",
                        tint = Color.White,
                        modifier = Modifier.padding(start = Dimensions.marginMedium)
                    )
                },
                onClick = {},
                horizontalPadding = Dimensions.paddingHuge,
            )
            Spacer(Modifier.height(8.dp))
            PrimaryButton(
                text = "Disabled Button",
                onClick = {},
                enabled = false,
                horizontalPadding = Dimensions.paddingHuge,
            )
        }
    }
}