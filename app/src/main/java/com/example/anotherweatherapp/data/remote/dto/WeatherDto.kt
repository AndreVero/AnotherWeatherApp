package com.example.anotherweatherapp.data.remote.dto

import com.squareup.moshi.Json

data class WeatherDto (

    @field:Json(name = "hourly")
    val weatherData: WeatherDataDto
    )