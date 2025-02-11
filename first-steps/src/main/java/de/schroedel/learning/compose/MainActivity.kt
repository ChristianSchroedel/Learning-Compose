package de.schroedel.learning.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import de.schroedel.learning.compose.ui.screens.BasicScreen
import de.schroedel.learning.compose.ui.theme.LearningComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearningComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
