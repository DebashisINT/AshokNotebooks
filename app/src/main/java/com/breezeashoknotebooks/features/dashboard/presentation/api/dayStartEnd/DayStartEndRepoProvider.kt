package com.breezeashoknotebooks.features.dashboard.presentation.api.dayStartEnd

import com.breezeashoknotebooks.features.stockCompetetorStock.api.AddCompStockApi
import com.breezeashoknotebooks.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}