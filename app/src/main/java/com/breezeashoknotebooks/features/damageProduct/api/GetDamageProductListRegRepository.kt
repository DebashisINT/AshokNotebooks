package com.breezeashoknotebooks.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.breezeashoknotebooks.app.FileUtils
import com.breezeashoknotebooks.base.BaseResponse
import com.breezeashoknotebooks.features.NewQuotation.model.*
import com.breezeashoknotebooks.features.addshop.model.AddShopRequestData
import com.breezeashoknotebooks.features.addshop.model.AddShopResponse
import com.breezeashoknotebooks.features.damageProduct.model.DamageProductResponseModel
import com.breezeashoknotebooks.features.damageProduct.model.delBreakageReq
import com.breezeashoknotebooks.features.damageProduct.model.viewAllBreakageReq
import com.breezeashoknotebooks.features.login.model.userconfig.UserConfigResponseModel
import com.breezeashoknotebooks.features.myjobs.model.WIPImageSubmit
import com.breezeashoknotebooks.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}