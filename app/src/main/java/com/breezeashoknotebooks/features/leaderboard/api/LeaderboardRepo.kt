package com.breezeashoknotebooks.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezeashoknotebooks.app.FileUtils
import com.breezeashoknotebooks.app.Pref
import com.breezeashoknotebooks.base.BaseResponse
import com.breezeashoknotebooks.features.addshop.model.AddLogReqData
import com.breezeashoknotebooks.features.addshop.model.AddShopRequestData
import com.breezeashoknotebooks.features.addshop.model.AddShopResponse
import com.breezeashoknotebooks.features.addshop.model.LogFileResponse
import com.breezeashoknotebooks.features.addshop.model.UpdateAddrReq
import com.breezeashoknotebooks.features.contacts.CallHisDtls
import com.breezeashoknotebooks.features.contacts.CompanyReqData
import com.breezeashoknotebooks.features.contacts.ContactMasterRes
import com.breezeashoknotebooks.features.contacts.SourceMasterRes
import com.breezeashoknotebooks.features.contacts.StageMasterRes
import com.breezeashoknotebooks.features.contacts.StatusMasterRes
import com.breezeashoknotebooks.features.contacts.TypeMasterRes
import com.breezeashoknotebooks.features.dashboard.presentation.DashboardActivity
import com.breezeashoknotebooks.features.login.model.WhatsappApiData
import com.breezeashoknotebooks.features.login.model.WhatsappApiFetchData
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Puja on 10-10-2024.
 */
class LeaderboardRepo(val apiService: LeaderboardApi) {

    fun branchlist(session_token: String): Observable<LeaderboardBranchData> {
        return apiService.branchList(session_token)
    }
    fun ownDatalist(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOwnData> {
        return apiService.ownDatalist(user_id,activitybased,branchwise,flag)
    }
    fun overAllAPI(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,activitybased,branchwise,flag)
    }
}