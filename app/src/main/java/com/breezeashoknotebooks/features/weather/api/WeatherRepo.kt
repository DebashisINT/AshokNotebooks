package com.breezeashoknotebooks.features.weather.api

import com.breezeashoknotebooks.base.BaseResponse
import com.breezeashoknotebooks.features.task.api.TaskApi
import com.breezeashoknotebooks.features.task.model.AddTaskInputModel
import com.breezeashoknotebooks.features.weather.model.ForeCastAPIResponse
import com.breezeashoknotebooks.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}