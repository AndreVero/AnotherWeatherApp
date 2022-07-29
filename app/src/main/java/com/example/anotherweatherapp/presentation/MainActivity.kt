package com.example.anotherweatherapp.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import com.example.anotherweatherapp.presentation.ui.theme.AnotherWeatherAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnotherWeatherAppTheme {
                Text(text = "Hello Compose")
            }
        }
    }
}