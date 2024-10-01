package com.breezeashoknotebooks.features.login.api.productlistapi

import com.breezeashoknotebooks.app.Pref
import com.breezeashoknotebooks.app.domain.ProductListEntity
import com.breezeashoknotebooks.app.utils.AppUtils
import com.breezeashoknotebooks.base.BaseResponse
import com.breezeashoknotebooks.features.login.model.productlistmodel.ProductListOfflineResponseModel
import com.breezeashoknotebooks.features.login.model.productlistmodel.ProductListOfflineResponseModelNew
import com.breezeashoknotebooks.features.login.model.productlistmodel.ProductListResponseModel
import com.breezeashoknotebooks.features.login.model.productlistmodel.ProductRateListResponseModel
import com.breezeashoknotebooks.features.orderITC.GetOrderHistory
import com.breezeashoknotebooks.features.orderITC.GetProductRateReq
import com.breezeashoknotebooks.features.orderITC.GetProductReq
import com.breezeashoknotebooks.features.orderITC.SyncOrd
import com.breezeashoknotebooks.features.viewAllOrder.orderOptimized.ProductRateOnlineListResponseModel
import io.reactivex.Observable
import timber.log.Timber

/**
 * Created by Saikat on 20-11-2018.
 */
class ProductListRepo(val apiService: ProductListApi) {
    fun getProductList(session_token: String, user_id: String, last_update_date: String): Observable<ProductListResponseModel> {
        Timber.d("ProductListRepo hit ${Pref.isOrderShow} ${Pref.IsShowQuotationFooterforEurobond}" +  "Time : " + AppUtils.getCurrentDateTime())
        return apiService.getProductList(session_token, user_id, last_update_date)
    }


    fun getProductRateList(shop_id: String): Observable<ProductRateListResponseModel> {
        return apiService.getProductRateList(Pref.session_token!!, Pref.user_id!!, shop_id)
    }


    fun getProductRateListByEntity(shop_id: String): Observable<ProductRateOnlineListResponseModel> {
        return apiService.getProductRateOnlineList(Pref.session_token!!, Pref.user_id!!, shop_id)
    }

    fun getProductRateOfflineList(): Observable<ProductListOfflineResponseModel> {
        return apiService.getOfflineProductRateList(Pref.session_token!!, Pref.user_id!!)
    }


    fun getProductRateOfflineListNew(): Observable<ProductListOfflineResponseModelNew> {
        return apiService.getOfflineProductRateListNew(Pref.session_token!!, Pref.user_id!!)
    }

    fun syncProductListITC(obj: SyncOrd): Observable<BaseResponse> {
        return apiService.syncProductListITC(obj)
    }

    fun getProductListITC(session_token: String, user_id: String): Observable<GetProductReq> {
        return apiService.getProductListITC(session_token, user_id)
    }

    fun getProductRateListITC(session_token: String, user_id: String): Observable<GetProductRateReq> {
        return apiService.getProductRateListITC(session_token, user_id)
    }

    fun getOrderHistory(user_id:String): Observable<GetOrderHistory> {
        return apiService.getOrderHistoryApi(user_id)
    }


}