package com.example.cubical.algorithm

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.style.*

@Composable
fun AlgorithmCard(algorithm: Algorithm) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            /*Image(
                painter = painterResource(id = algorithm.imageRes),
                contentDescription = "Rubik's Cube pattern",
                modifier = Modifier.size(120.dp)
            )*/
//            Spacer(modifier = Modifier.height(8.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = algorithm.type,     fontSize = 16.sp)
                Text(text = algorithm.group,    fontSize = 16.sp)
                Text(text = algorithm.name,     fontSize = 16.sp)
            }
            Spacer(modifier = Modifier.height(4.dp))
            Row() {
                Text(text = algorithm.moves,
                    fontSize = 16.sp,
                    textAlign = TextAlign.Start,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
}
