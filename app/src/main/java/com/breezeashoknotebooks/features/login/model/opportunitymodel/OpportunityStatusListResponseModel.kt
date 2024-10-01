package com.breezeashoknotebooks.features.login.model.opportunitymodel

import com.breezeashoknotebooks.app.domain.OpportunityStatusEntity
import com.breezeashoknotebooks.app.domain.ProductListEntity
import com.breezeashoknotebooks.base.BaseResponse

/**
 * Created by Puja on 30.05.2024
 */
class OpportunityStatusListResponseModel : BaseResponse() {
    var status_list: ArrayList<OpportunityStatusEntity>? = null
}