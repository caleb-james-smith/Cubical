package com.example.cubical

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.cubical.ui.theme.CubicalTheme
import com.example.cubical.algorithm.Algorithm
import com.example.cubical.algorithm.AlgorithmScreen
import com.example.cubical.algorithm.AlgorithmGroup
import com.example.cubical.algorithm.HomeScreen
import com.example.cubical.algorithm.CreateOLLScreen
import com.example.cubical.algorithm.CreatePLLScreen
import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.InputStreamReader

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            val context = LocalContext.current
            CubicalTheme {
                /*Surface {
                    CreateOLLScreen(context = LocalContext.current)
                }*/
                NavHost(navController, startDestination = "home") {
                    composable("home") { HomeScreen(navController) }
//                    composable("moveNotation") { MoveNotationScreen() }
                    composable("ollScreen") { CreateOLLScreen(context) }
                    composable("pllScreen") { CreatePLLScreen(context) }
                }
            }
        }
    }
}

/*@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreateOLLScreen(context: Context) {
    val algorithms = loadAlgorithmsFromJson(context, R.raw.oll_algorithms)
    val groupedAlgorithms = algorithms.groupBy { it.group }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("OLL Algorithms") }
            )
        }
    ) { paddingValues ->
        *//*AlgorithmScreen(
            algorithms = algorithms,
            modifier = Modifier.padding(paddingValues)
        )*//*
        LazyColumn(
            modifier = Modifier.padding(paddingValues)
        ) {
            groupedAlgorithms.forEach { (groupName, algorithms) ->
                item {
                    AlgorithmGroup(groupName = groupName, algorithms = algorithms)
                }
            }
        }
    }
}*/

/*@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreatePLLScreen(context: Context) {
    val algorithms = loadAlgorithmsFromJson(context, R.raw.pll_algorithms)
    val groupedAlgorithms = algorithms.groupBy { it.group }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("PLL Algorithms") }
            )
        }
    ) { paddingValues ->
        *//*AlgorithmScreen(
            algorithms = algorithms,
            modifier = Modifier.padding(paddingValues)
        )*//*
        LazyColumn(
            modifier = Modifier.padding(paddingValues)
        ) {
            groupedAlgorithms.forEach { (groupName, algorithms) ->
                item {
                    AlgorithmGroup(groupName = groupName, algorithms = algorithms)
                }
            }
        }
    }
}*/

fun loadAlgorithmsFromJson(context: Context, jsonResourceId: Int): List<Algorithm> {
    return try {
        val inputStream = context.resources.openRawResource(jsonResourceId)
        val reader = InputStreamReader(inputStream)
        val type = object : TypeToken<List<Algorithm>>() {}.type
        Gson().fromJson<List<Algorithm>>(reader, type) ?: emptyList()
    } catch (e: Exception) {
        e.printStackTrace()
        emptyList()
    }
}
