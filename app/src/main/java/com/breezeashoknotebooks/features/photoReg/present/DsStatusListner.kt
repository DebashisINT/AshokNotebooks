package com.breezeashoknotebooks.features.photoReg.present

import com.breezeashoknotebooks.app.domain.ProspectEntity
import com.breezeashoknotebooks.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}