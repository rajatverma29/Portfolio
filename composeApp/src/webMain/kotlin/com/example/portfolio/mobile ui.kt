package com.example.portfolio

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay

@Composable
fun PortfolioMobileUi() {

    val text = "Android Developer"
    var displayedtext by remember { mutableStateOf("") }


    LaunchedEffect(Unit) {

        for (i in 0..text.length) {

            displayedtext = text.substring(0, i)

            delay(100)

        }
    }

    BoxWithConstraints(Modifier.fillMaxSize().background(CarbonBlack)) {

        val toppadding = maxHeight * 0.12f
        Column(
            modifier = Modifier.fillMaxSize()
                .padding(top = toppadding, start = 20.dp, end = 20.dp, bottom = 20.dp)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {

            Text("Hi I am,", fontSize = 20.sp, fontWeight = FontWeight.SemiBold, color = Color.Gray)
            Spacer(Modifier.height(5.dp))
            Text("Rajat Verma", fontSize = 30.sp, fontWeight = FontWeight.Bold, color = Color.Gray)
            Spacer(Modifier.height(5.dp))
            Text(displayedtext, fontSize = 45.sp, fontWeight = FontWeight.SemiBold, color = Orange)

            Button(
                modifier= Modifier.fillMaxWidth(0.4f).height(60.dp),
                onClick = {},
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Orange, contentColor = White)
            ) {

                Text("Resume", fontSize = 20.sp)
            }

        }


        TopBar(clicked = {}, true)
    }


}