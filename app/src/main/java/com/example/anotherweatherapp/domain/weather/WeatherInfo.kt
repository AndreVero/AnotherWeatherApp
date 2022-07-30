package com.example.anotherweatherapp.domain.weather

import com.example.anotherweatherapp.domain.model.WeatherData

data class WeatherInfo(
    val weatherDataPerDay: Map<Int, List<WeatherData>>,
    val currentWeatherData: WeatherData?
)