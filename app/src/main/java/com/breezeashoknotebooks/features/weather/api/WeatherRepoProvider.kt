package com.breezeashoknotebooks.features.weather.api

import com.breezeashoknotebooks.features.task.api.TaskApi
import com.breezeashoknotebooks.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}