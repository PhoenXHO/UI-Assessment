package com.test.technicalassessment.ui.components.inputs

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Check
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.test.technicalassessment.ui.components.text.CText
import com.test.technicalassessment.ui.theme.PreviewTheme

/**
 * CRadioButton is a customizable radio button component with a gradient border and checkmark icon.
 *
 * @param isSelected Indicates whether the radio button is selected or not.
 * @param modifier Modifier to be applied to the radio button.
 * @param onClick Callback function to be invoked when the radio button is clicked.
 * @param enabled Indicates whether the radio button is enabled or disabled. Default is `true`.
 * @param size Size of the radio button. Default is `30.dp`.
 * @param borderWidth Width of the border around the radio button. Default is `2.5.dp`.
 * @param interactionSource Interaction source for handling gestures and clicks.
 *
 * @see androidx.compose.foundation.Canvas
 */
@Composable
fun CRadioButton(
    isSelected: Boolean,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    enabled: Boolean = true,
    size: Dp = 30.dp,
    borderWidth: Dp = 2.5.dp,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val gradientSelected = Brush.verticalGradient(
        colors = listOf(
            MaterialTheme.colorScheme.primaryContainer,
            MaterialTheme.colorScheme.primary,
        )
    )
    val brushDisabled = Brush.linearGradient(
        colors = listOf(Color.Gray, Color.Gray))
    val borderBrush = if (enabled) gradientSelected else brushDisabled
    val checkmarkColor = MaterialTheme.colorScheme.primary

    val clickableModifier = if (enabled) {
        Modifier.clickable(
            interactionSource = interactionSource,
            indication = rememberRipple(bounded = false, radius = size / 2 + 12.dp), // Ripple effect
            enabled = enabled,
            onClick = onClick,
            role = Role.RadioButton,
        )
    } else {
        Modifier // No click action if disabled
    }

    Box(
        modifier = modifier
            .size(size)
            .then(clickableModifier)
            .padding(borderWidth / 2), // Padding to create space for the border
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.matchParentSize()) {
            val radius = (size / 2 - borderWidth).toPx() // Radius of the inner circle
            drawCircle(
                brush = borderBrush,
                radius = radius,
                style = Stroke(width = borderWidth.toPx())
            )
        }

        if (isSelected) {
            Icon(
                imageVector = Icons.Rounded.Check,
                contentDescription = "Selected",
                modifier = Modifier.size(size * 0.6f),
                tint = checkmarkColor
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CRadioButtonPreview() {
    PreviewTheme {
        Row(Modifier.padding(16.dp)) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                CText(text = "Selected")
                Spacer(Modifier.height(4.dp))
                CRadioButton(isSelected = true, onClick = {})
            }
            Spacer(Modifier.width(16.dp))
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                CText(text = "Unselected")
                Spacer(Modifier.height(4.dp))
                CRadioButton(isSelected = false, onClick = {})
            }
             Spacer(Modifier.width(16.dp))
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                CText(text = "Disabled")
                Spacer(Modifier.height(4.dp))
                CRadioButton(isSelected = false, onClick = {}, enabled = false)
            }
        }
    }
}