package com.ahmet.bostanciklioglu.androidweatherapp.repository

import com.ahmet.bostanciklioglu.androidweatherapp.api.ApiService
import javax.inject.Inject

class WeatherRepository
@Inject
constructor(private val apiService: ApiService) {
    suspend fun getWeather() = apiService.getWeather()
}