package com.example.anotherweatherapp.data.repository

import com.example.anotherweatherapp.data.mappers.toWeatherInfo
import com.example.anotherweatherapp.data.remote.WeatherApi
import com.example.anotherweatherapp.domain.repository.WeatherRepository
import com.example.anotherweatherapp.domain.util.Resource
import com.example.anotherweatherapp.domain.weather.WeatherInfo
import java.lang.Error
import java.lang.Exception
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi
) : WeatherRepository {

    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeather(
                    lat = lat,
                    long = long
                ).toWeatherInfo()
            )
        } catch (e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred.")
        }
    }
}