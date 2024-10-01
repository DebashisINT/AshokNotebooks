package com.breezeashoknotebooks.features.orderList.model

import com.breezeashoknotebooks.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}