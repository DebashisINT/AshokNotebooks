package com.breezeashoknotebooks.features.login.model

import com.breezeashoknotebooks.base.BaseResponse
import java.io.Serializable

/**
 * Created by Saikat on 16-Apr-20.
 */
class NewSettingsResponseModel : Serializable, BaseResponse() {
    var isFingerPrintMandatoryForAttendance: Boolean? = null
    var isFingerPrintMandatoryForVisit: Boolean? = null
    var isSelfieMandatoryForAttendance: Boolean? = null
    var isAddAttendence: Boolean? = null
}