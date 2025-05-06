package com.test.technicalassessment.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.test.technicalassessment.ui.components.text.CText
import com.test.technicalassessment.ui.components.navigation.CTopAppBar
import com.test.technicalassessment.ui.components.text.OnSurfaceText
import com.test.technicalassessment.ui.components.inputs.PrimaryButton
import com.test.technicalassessment.ui.components.inputs.RadioButtonWithText
import com.test.technicalassessment.ui.components.surfaces.RoundedSurface
import com.test.technicalassessment.ui.icons.chevronsRight
import com.test.technicalassessment.ui.icons.patchExclamation
import com.test.technicalassessment.ui.theme.Dimensions
import com.test.technicalassessment.ui.theme.PreviewTheme

/**
 * FileRecoveryScreen is a composable function that displays a screen for selecting actions
 * related to file recovery.
 *
 * @param modifier Modifier to be applied to the screen.
 */
@Composable
fun FileRecoveryScreen(
    modifier: Modifier = Modifier,
) {
    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            CTopAppBar(
                title = "Select the required actions",
                backActionEnabled = true,
                onBackClick = { /* Handle back action */ },
            )
        },
    ) { innerPadding ->
        Column(
            modifier = modifier
                .padding(innerPadding)
                .padding(horizontal = Dimensions.defaultMargin)
                .fillMaxSize()
        ) {
            RoundedSurface(
                modifier = Modifier
                    .padding(vertical = Dimensions.marginSmall)
                    .weight(1f) // Fill the remaining space
                    .fillMaxWidth(),
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                ) {
                    // Title
                    OnSurfaceText(
                        text = "What do you want to transfer from stolen mobile?",
                        textStyle = MaterialTheme.typography.titleSmall,
                    )
                    Spacer(modifier = Modifier.padding(2.dp))
                    CText(
                        text = "(Multiple choice)",
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        textStyle = MaterialTheme.typography.bodySmall
                    )

                    Spacer(modifier = Modifier.padding(12.dp))

                    // Choices
                    val options = listOf("Photos", "Contacts", "Docs")
                    var selectedOption by remember { mutableStateOf("All") }
                    options.forEach { option ->
                        RadioButtonWithText(
                            text = option,
                            isSelected = selectedOption == option,
                            onClick = {
                                selectedOption = option
                            },
                            modifier = Modifier
                                .padding(bottom = Dimensions.marginLarge)
                        )
                    }
                    // Divider line
                    HorizontalDivider(
                        modifier = Modifier
                            .width(128.dp)
                            .align(Alignment.CenterHorizontally)
                            .padding(bottom = Dimensions.defaultMargin),
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                            .copy(alpha = 0.2f),
                    )
                    // All option
                    RadioButtonWithText(
                        text = "All",
                        isSelected = selectedOption == "All",
                        onClick = {
                            selectedOption = "All"
                        },
                        modifier = Modifier
                            .padding(bottom = Dimensions.defaultMargin)
                    )
                }
            }

            RoundedSurface(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = Dimensions.marginHuge),
            ) {
                Column {
                    Row {
                        Icon(
                            imageVector = patchExclamation,
                            contentDescription = "Alert",
                            tint = Color.White,
                            modifier = Modifier
                                .size(40.dp)
                                .padding(end = Dimensions.marginMedium)
                                .align(Alignment.Top)
                        )

                        CText(
                            text = "Select the data to transfer from the stolen device to save important information and protect confidential data.",
                            color = Color.White,
                            textStyle = MaterialTheme.typography.bodySmall,
                            modifier = Modifier
                                .weight(1f)
                                .align(Alignment.Top)
                        )
                    }

                    Spacer(modifier = Modifier.padding(Dimensions.marginSmall))

                    PrimaryButton(
                        text = "START TO TRANSFER",
                        suffix = {
                            Icon(
                                imageVector = chevronsRight,
                                contentDescription = "Continue",
                                tint = Color.White,
                                modifier = Modifier
                                    .size(40.dp)
                                    .padding(start = Dimensions.marginMedium)
                            )
                        },
                        textStyle = MaterialTheme.typography.displaySmall,
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalPadding = Dimensions.paddingSmall,
                        onClick = { /* Handle continue action */ },
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FileRecoveryScreenPreview() {
    PreviewTheme {
        FileRecoveryScreen(
            modifier = Modifier.fillMaxSize()
        )
    }
}