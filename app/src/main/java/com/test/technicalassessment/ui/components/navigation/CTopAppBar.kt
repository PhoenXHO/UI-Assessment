package com.test.technicalassessment.ui.components.navigation

import androidx.compose.foundation.layout.height
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.test.technicalassessment.ui.icons.arrowBackIOSNew
import com.test.technicalassessment.ui.theme.PreviewTheme

/**
 * CTopAppBar is a composable function that displays a top app bar with a title and an optional back button.
 * It uses Material3's CenterAlignedTopAppBar for consistent styling and theming.
 *
 * @param title The title to be displayed in the app bar.
 * @param backActionEnabled Flag to enable or disable the back action. Default is `false`.
 * @param onBackClick Callback function to be invoked when the back button is clicked. Default is `{}`.
 *
 * @see androidx.compose.material3.CenterAlignedTopAppBar
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CTopAppBar(
    title: String,
    backActionEnabled: Boolean = false,
    onBackClick: () -> Unit = {},
) {
    CenterAlignedTopAppBar(
        title = { Text(title) },
        navigationIcon = {
			// Show back button only if backActionEnabled is true
            if (backActionEnabled) {
                IconButton(onClick = onBackClick) {
                    Icon(
                        imageVector = arrowBackIOSNew,
                        contentDescription = "Back",
                        modifier = Modifier.height(24.dp)
                    )
                }
            }
        },
        colors = TopAppBarColors(
            containerColor = MaterialTheme.colorScheme.background,
            titleContentColor = MaterialTheme.colorScheme.onBackground,
            navigationIconContentColor = MaterialTheme.colorScheme.onBackground,
            scrolledContainerColor = MaterialTheme.colorScheme.background,
            actionIconContentColor = MaterialTheme.colorScheme.onBackground,
        ),
    )
}

@Preview
@Composable
fun CTopAppBarPreview() {
    PreviewTheme {
        CTopAppBar(
            title = "File Recovery",
            backActionEnabled = true,
            onBackClick = {}
        )
    }
}