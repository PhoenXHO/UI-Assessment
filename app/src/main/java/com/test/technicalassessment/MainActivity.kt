package com.test.technicalassessment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.test.technicalassessment.ui.screens.FileRecoveryScreen
import com.test.technicalassessment.ui.theme.TechnicalAssessmentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TechnicalAssessmentTheme(dynamicColor = false) {
                FileRecoveryScreen(
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}