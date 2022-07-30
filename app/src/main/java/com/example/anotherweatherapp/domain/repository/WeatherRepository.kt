package com.example.anotherweatherapp.domain.repository

import com.example.anotherweatherapp.domain.util.Resource
import com.example.anotherweatherapp.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double) : Resource<WeatherInfo>
}