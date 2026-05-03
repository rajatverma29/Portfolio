package com.example.portfolio

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay

@Composable
fun PortfolioLaptopUi(){

    val text="Android Developer"
    var displayedtext by remember { mutableStateOf("") }


    LaunchedEffect(Unit){

        for(i in 0..text.length){

            displayedtext= text.substring(0,i)

            delay(100)

        }
    }



    MaterialTheme {

        Box(Modifier.fillMaxSize().background(CarbonBlack)) {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 50.dp, vertical = 20.dp)
                    .verticalScroll(rememberScrollState())
                    ,


                ) {
                Spacer(Modifier.fillMaxHeight(0.11f))
                Text("Hi I am,", fontSize = 25.sp, fontWeight = FontWeight.SemiBold, color = Color.Gray)
                Spacer(Modifier.height(5.dp))
                Text("Rajat Verma", fontSize = 40.sp, fontWeight = FontWeight.Bold, color = Color.Gray)
                Spacer(Modifier.height(5.dp))
                Text(displayedtext , fontSize = 60.sp, fontWeight = FontWeight.SemiBold, color = Orange)

            }
            TopBar(clicked = {},false)
        }
    }

}