package com.breezeashoknotebooks.features.stockAddCurrentStock.api

import com.breezeashoknotebooks.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezeashoknotebooks.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}