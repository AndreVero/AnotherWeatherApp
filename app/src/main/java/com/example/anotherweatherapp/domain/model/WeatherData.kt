package com.example.anotherweatherapp.domain.model

import com.example.anotherweatherapp.domain.weather.WeatherType
import java.time.LocalDateTime

data class WeatherData(
    val time: LocalDateTime,
    val temperatureCelsius: Double,
    val pressure: Double,
    val windSpeed: Double,
    val humidity: Double,
    val weatherType: WeatherType
)
