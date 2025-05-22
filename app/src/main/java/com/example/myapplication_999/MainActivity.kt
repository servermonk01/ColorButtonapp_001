package com.example.myapplication_999

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.myapplication_999.ui.theme.MyApplication_999Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplication_999Theme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    ColorButtonsUI()
                }
            }
        }
    }
}

@Composable
fun ColorButtonsUI() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val colors = listOf(
            "Red" to Color.Red,
            "Green" to Color.Green,
            "Blue" to Color.Blue,
            "Yellow" to Color.Yellow
        )

        colors.forEach { (name, color) ->
            var bgColor by remember { mutableStateOf(Color.White) }

            Button(
                onClick = { bgColor = color },
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
                    .height(50.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = bgColor,
                    contentColor = Color.Black  // Text color
                )
            ) {
                Text(text = name)
            }
        }
    }
}

