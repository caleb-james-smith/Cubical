package com.example.cubical.algorithm

import android.content.Context
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.cubical.loadAlgorithmsFromJson
import com.example.cubical.R

@OptIn(ExperimentalMaterial3Api::class)
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
        /*AlgorithmScreen(
            algorithms = algorithms,
            modifier = Modifier.padding(paddingValues)
        )*/
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
}
