package com.example.cubical.algorithm

import android.content.Context
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.*
import androidx.compose.ui.text.style.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.cubical.loadAlgorithmsFromJson
import com.example.cubical.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreateOLLScreen(context: Context, navController: NavController) {
    val algorithms = loadAlgorithmsFromJson(context, R.raw.oll_algorithms)
    val groupedAlgorithms = algorithms.groupBy { it.group }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("OLL Algorithms") },
                navigationIcon = {
                    IconButton(onClick = { navController.navigate("home") }) {
                        Icon(
                            imageVector = Icons.Default.Home,
                            contentDescription = "Home"
                        )
                    }
                }
            )
        }
    ) { innerPadding ->
//    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = innerPadding.calculateTopPadding())
//                .padding(horizontal = 8.dp)
//                .padding(top = paddingValues.calculateTopPadding())
        ) {
            Text(
                text = "Number of algorithms: ${algorithms.size}",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium,
                textAlign = TextAlign.Left
            )

//            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Number of groups: ${groupedAlgorithms.size}",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium,
                textAlign = TextAlign.Left
            )

            Spacer(modifier = Modifier.height(8.dp))

            LazyColumn(
                modifier = Modifier.fillMaxSize()
//                modifier = Modifier.padding(paddingValues)
            ) {
                groupedAlgorithms.forEach { (groupName, algorithms) ->
                    item {
                        AlgorithmGroup(groupName = groupName, algorithms = algorithms)
                    }
                }
            }
        }
    }
}
