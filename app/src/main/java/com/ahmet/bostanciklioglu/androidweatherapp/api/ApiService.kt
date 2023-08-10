package com.ahmet.bostanciklioglu.androidweatherapp.api


import com.ahmet.bostanciklioglu.androidweatherapp.model.Weather
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("weather/London")
    suspend fun getWeather(): Response<Weather>
}