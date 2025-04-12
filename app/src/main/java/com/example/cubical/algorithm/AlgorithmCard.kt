package com.example.cubical.algorithm

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.*
import androidx.compose.ui.text.style.*
import androidx.compose.ui.layout.ContentScale
import com.example.cubical.R

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
                modifier = Modifier.size(80.dp).padding(8.dp),
                contentScale = ContentScale.Fit  // maintain aspect ratio
            )
            Column(
                modifier = Modifier.padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = algorithm.name,     fontSize = 16.sp, fontWeight = FontWeight.Bold)
                    Text(text = algorithm.nickname, fontSize = 16.sp, fontWeight = FontWeight.Bold)
                }
                Spacer(modifier = Modifier.height(4.dp))
                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = algorithm.moves,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
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
        "OLL_01" -> R.drawable.oll_01
        "OLL_02" -> R.drawable.oll_02
        "OLL_03" -> R.drawable.oll_03
        "OLL_04" -> R.drawable.oll_04
        "OLL_05" -> R.drawable.oll_05
        "OLL_06" -> R.drawable.oll_06
        "OLL_07" -> R.drawable.oll_07
        "OLL_08" -> R.drawable.oll_08
        "OLL_09" -> R.drawable.oll_09
        "OLL_10" -> R.drawable.oll_10
        "OLL_11" -> R.drawable.oll_11
        "OLL_12" -> R.drawable.oll_12
        "OLL_13" -> R.drawable.oll_13
        "OLL_14" -> R.drawable.oll_14
        "OLL_15" -> R.drawable.oll_15
        "OLL_16" -> R.drawable.oll_16
        "OLL_17" -> R.drawable.oll_17
        "OLL_18" -> R.drawable.oll_18
        "OLL_19" -> R.drawable.oll_19
        "OLL_20" -> R.drawable.oll_20
        "OLL_21" -> R.drawable.oll_21
        "OLL_22" -> R.drawable.oll_22
        "OLL_23" -> R.drawable.oll_23
        "OLL_24" -> R.drawable.oll_24
        "OLL_25" -> R.drawable.oll_25
        "OLL_26" -> R.drawable.oll_26
        "OLL_27" -> R.drawable.oll_27
        "OLL_28" -> R.drawable.oll_28
        "OLL_29" -> R.drawable.oll_29
        "OLL_30" -> R.drawable.oll_30
        "OLL_31" -> R.drawable.oll_31
        "OLL_32" -> R.drawable.oll_32
        "OLL_33" -> R.drawable.oll_33
        "OLL_34" -> R.drawable.oll_34
        "OLL_35" -> R.drawable.oll_35
        "OLL_36" -> R.drawable.oll_36
        "OLL_37" -> R.drawable.oll_37
        "OLL_38" -> R.drawable.oll_38
        "OLL_39" -> R.drawable.oll_39
        "OLL_40" -> R.drawable.oll_40
        "OLL_41" -> R.drawable.oll_41
        "OLL_42" -> R.drawable.oll_42
        "OLL_43" -> R.drawable.oll_43
        "OLL_44" -> R.drawable.oll_44
        "OLL_45" -> R.drawable.oll_45
        "OLL_46" -> R.drawable.oll_46
        "OLL_47" -> R.drawable.oll_47
        "OLL_48" -> R.drawable.oll_48
        "OLL_49" -> R.drawable.oll_49
        "OLL_50" -> R.drawable.oll_50
        "OLL_51" -> R.drawable.oll_51
        "OLL_52" -> R.drawable.oll_52
        "OLL_53" -> R.drawable.oll_53
        "OLL_54" -> R.drawable.oll_54
        "OLL_55" -> R.drawable.oll_55
        "OLL_56" -> R.drawable.oll_56
        "OLL_57" -> R.drawable.oll_57
        else -> R.drawable.ic_placeholder // placeholder image
    }
}
