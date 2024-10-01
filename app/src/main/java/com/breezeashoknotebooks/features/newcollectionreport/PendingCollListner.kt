package com.breezeashoknotebooks.features.newcollectionreport

import com.breezeashoknotebooks.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}