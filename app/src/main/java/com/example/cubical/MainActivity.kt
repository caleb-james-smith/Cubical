package com.example.cubical

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.cubical.ui.theme.CubicalTheme
import com.example.cubical.algorithm.Algorithm
import com.example.cubical.algorithm.AlgorithmScreen
import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.InputStreamReader

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CubicalTheme {
                Surface {
                    CreateAlgorithmScreen(context = LocalContext.current)
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreateAlgorithmScreen(context: Context) {
    val algorithms = loadAlgorithmsFromJson(context)
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("OLL Algorithms") }
            )
        }
    ) { paddingValues ->
        AlgorithmScreen(
            algorithms = algorithms,
            modifier = Modifier.padding(paddingValues)
        )
    }
}

fun loadAlgorithmsFromJson(context: Context): List<Algorithm> {
    val inputStream = context.resources.openRawResource(R.raw.oll_algorithms)
    val reader = InputStreamReader(inputStream)
    val type = object : TypeToken<List<Algorithm>>() {}.type
    return Gson().fromJson(reader, type)
}
