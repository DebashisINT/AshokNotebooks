package com.breezeashoknotebooks.features.stockAddCurrentStock.api

import com.breezeashoknotebooks.base.BaseResponse
import com.breezeashoknotebooks.features.location.model.ShopRevisitStatusRequest
import com.breezeashoknotebooks.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezeashoknotebooks.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.breezeashoknotebooks.features.stockAddCurrentStock.model.CurrentStockGetData
import com.breezeashoknotebooks.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}