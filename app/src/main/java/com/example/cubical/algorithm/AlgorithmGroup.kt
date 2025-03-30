package com.example.cubical.algorithm

import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.ui.text.font.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AlgorithmGroup(
    groupName: String,
    algorithms: List<Algorithm>
) {
    // boolean for expanded state
    var expanded by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        // Group Button (Dropdown Toggle)
        Button(
            onClick = { expanded = !expanded },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = groupName,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }

        // v1: app is stopping (crashing)... this is broken!
        // Show algorithms only if expanded
//        if (expanded) {
//            LazyColumn {
//                items(algorithms) { algorithm ->
//                    AlgorithmCard(algorithm)
//                }
//            }
//        }

        // v2: testing...
        // Show algorithms only if expanded
        if (expanded) {
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                // Iterate over the algorithms in the group and display them
                algorithms.forEach { algorithm ->
                    AlgorithmCard(algorithm)
                }
            }
        }
    }
}
