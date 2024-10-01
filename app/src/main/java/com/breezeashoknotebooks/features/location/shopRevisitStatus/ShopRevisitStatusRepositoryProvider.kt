package com.breezeashoknotebooks.features.location.shopRevisitStatus

import com.breezeashoknotebooks.features.location.shopdurationapi.ShopDurationApi
import com.breezeashoknotebooks.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}