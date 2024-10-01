package com.breezeashoknotebooks.features.nearbyuserlist.api

import com.breezeashoknotebooks.app.Pref
import com.breezeashoknotebooks.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezeashoknotebooks.features.newcollection.model.NewCollectionListResponseModel
import com.breezeashoknotebooks.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}