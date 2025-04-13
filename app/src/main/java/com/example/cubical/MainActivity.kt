package com.example.cubical

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.cubical.ui.theme.CubicalTheme
import com.example.cubical.algorithm.Algorithm
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
                NavHost(navController, startDestination = "home") {
                    composable("home") { HomeScreen(navController) }
                    // TODO: Implement move notation screen
                    // composable("moveNotation") { MoveNotationScreen(context, navController) }
                    composable("ollScreen") { CreateOLLScreen(context, navController) }
                    composable("pllScreen") { CreatePLLScreen(context, navController) }
                }
            }
        }
    }
}

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
