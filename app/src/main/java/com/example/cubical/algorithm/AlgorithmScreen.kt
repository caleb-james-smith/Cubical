package com.example.cubical.algorithm

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun AlgorithmScreen(algorithms: List<Algorithm>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(algorithms) { algorithm ->
            AlgorithmCard(algorithm)
        }
    }
}
