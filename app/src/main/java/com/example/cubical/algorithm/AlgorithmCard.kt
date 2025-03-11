package com.example.cubical.algorithm

import com.example.cubical.R
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
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = getImageResource(algorithm.name)),
                contentDescription = algorithm.name,
                modifier = Modifier.size(120.dp)
            )
            Column(
                modifier = Modifier.padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = algorithm.name,         fontSize = 16.sp)
                    Text(text = algorithm.group,        fontSize = 16.sp)
                    Text(text = algorithm.long_name,    fontSize = 16.sp)
                }
                Spacer(modifier = Modifier.height(4.dp))
                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = algorithm.moves,
                        fontSize = 16.sp,
                        textAlign = TextAlign.Start,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
        }
    }
}

@Composable
fun getImageResource(name: String): Int {
    return when (name) {
        "OLL_21" -> R.drawable.oll_21
        "OLL_22" -> R.drawable.oll_22
        "OLL_23" -> R.drawable.oll_23
        "OLL_24" -> R.drawable.oll_24
        "OLL_25" -> R.drawable.oll_25
        "OLL_26" -> R.drawable.oll_26
        "OLL_27" -> R.drawable.oll_27
        else -> R.drawable.ic_placeholder // placeholder image
    }
}
