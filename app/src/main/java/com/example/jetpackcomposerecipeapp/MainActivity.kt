package com.example.jetpackcomposerecipeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Column(
                modifier = Modifier
                    .verticalScroll(rememberScrollState())
                    .background(color = Color(0xFFF2F2F2))
                    .fillMaxHeight()
            ) {
                Image(
                    painterResource(
                        R.drawable.happy_meal
                    ),
                    "content description",
                    modifier = Modifier.height(300.dp),
                    contentScale = ContentScale.Crop,
                )
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(
                        text = "Happy Mael",
                        style = TextStyle(fontSize = 26.sp)
                    )
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Text(
                        text = "800 Calories",
                        style = TextStyle(fontSize = 17.sp)
                    )
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Text(
                        text = "$5.99",
                        color = Color.Blue,
                        style = TextStyle(fontSize = 17.sp)
                    )
                }
            }


        }
    }
}
