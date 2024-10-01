package com.breezeashoknotebooks.features.stockCompetetorStock.api

import com.breezeashoknotebooks.app.NetworkConstant
import com.breezeashoknotebooks.base.BaseResponse
import com.breezeashoknotebooks.features.orderList.model.NewOrderListResponseModel
import com.breezeashoknotebooks.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.breezeashoknotebooks.features.stockAddCurrentStock.api.ShopAddStockApi
import com.breezeashoknotebooks.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.breezeashoknotebooks.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface AddCompStockApi {

    @POST("CompetitorStock/AddCompetitorStock")
    fun submShopCompStock(@Body shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest?): Observable<BaseResponse>

    @FormUrlEncoded
    @POST("CompetitorStock/CompetitorStockList")
    fun getCompStockList(@Field("session_token") session_token: String, @Field("user_id") user_id: String, @Field("date") date: String):
            Observable<CompetetorStockGetData>

    companion object Factory {
        fun create(): AddCompStockApi {
            val retrofit = Retrofit.Builder()
                    .client(NetworkConstant.setTimeOutNoRetry())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(NetworkConstant.BASE_URL)
                    .build()

            return retrofit.create(AddCompStockApi::class.java)
        }
    }

}