package com.breezeashoknotebooks.features.login.model.productlistmodel

import com.breezeashoknotebooks.app.domain.ModelEntity
import com.breezeashoknotebooks.app.domain.ProductListEntity
import com.breezeashoknotebooks.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}