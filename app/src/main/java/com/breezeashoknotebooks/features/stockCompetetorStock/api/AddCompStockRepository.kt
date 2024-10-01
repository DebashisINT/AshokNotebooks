package com.breezeashoknotebooks.features.stockCompetetorStock.api

import com.breezeashoknotebooks.base.BaseResponse
import com.breezeashoknotebooks.features.orderList.model.NewOrderListResponseModel
import com.breezeashoknotebooks.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.breezeashoknotebooks.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}