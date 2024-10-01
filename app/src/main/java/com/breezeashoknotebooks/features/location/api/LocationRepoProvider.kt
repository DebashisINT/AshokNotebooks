package com.breezeashoknotebooks.features.location.api

import com.breezeashoknotebooks.features.location.shopdurationapi.ShopDurationApi
import com.breezeashoknotebooks.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}