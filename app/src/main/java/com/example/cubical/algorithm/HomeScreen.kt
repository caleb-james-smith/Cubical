package com.example.cubical.algorithm

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Cubical") })
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
//            Button(onClick = { navController.navigate("moveNotation") }) {
//                Text("Move Notation")
//            }
//            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { navController.navigate("ollScreen") }) {
                Text("OLL Algorithms")
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { navController.navigate("pllScreen") }) {
                Text("PLL Algorithms")
            }
        }
    }
}
