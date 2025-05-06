package com.test.technicalassessment.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.test.technicalassessment.ui.theme.Dimensions
import com.test.technicalassessment.ui.theme.PreviewTheme

@Composable
fun RadioButtonWithText(
    text: String,
    isSelected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null,
                enabled = enabled,
                role = Role.RadioButton,
                onClick = onClick,
            )
    ) {
        CRadioButton(
            isSelected = isSelected,
            enabled = enabled,
            onClick = onClick,
            modifier = Modifier.padding(end = Dimensions.marginMedium),
        )
        CText(
            text = text,
            textStyle = MaterialTheme.typography.bodyLarge,
            color = if (enabled) {
                MaterialTheme.colorScheme.onSurface
            } else {
                MaterialTheme.colorScheme.onSurface.copy(alpha = 0.3f)
            },
        )
    }
}

@Preview
@Composable
fun RadioButtonWithTextPreview() {
    PreviewTheme {
        Row(Modifier.padding(16.dp)) {
            RadioButtonWithText(
                text = "Option 1",
                isSelected = true,
                onClick = {}
            )
            Spacer(Modifier.width(16.dp))
            RadioButtonWithText(
                text = "Option 2",
                isSelected = false,
                enabled = false,
                onClick = {}
            )
        }
    }
}