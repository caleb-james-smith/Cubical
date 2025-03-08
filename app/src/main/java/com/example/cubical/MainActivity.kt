package com.example.cubical

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.cubical.ui.theme.CubicalTheme
import com.example.cubical.algorithm.AlgorithmScreen
import com.example.cubical.algorithm.AlgorithmData

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CubicalTheme {
                Surface {
                    CreateAlgorithmScreen()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreateAlgorithmScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("OLL Algorithms") }
            )
        }
    ) { paddingValues ->
        AlgorithmScreen(
            algorithms = AlgorithmData.ollAlgorithms,
            modifier = Modifier.padding(paddingValues)
        )
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello, $name! Welcome to Cubical.",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CubicalTheme {
        Greeting("Cuber")
    }
}