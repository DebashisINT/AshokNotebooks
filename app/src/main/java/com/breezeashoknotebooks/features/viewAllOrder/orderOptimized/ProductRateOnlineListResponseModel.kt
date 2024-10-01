package com.breezeashoknotebooks.features.viewAllOrder.orderOptimized

import com.breezeashoknotebooks.app.domain.ProductOnlineRateTempEntity
import com.breezeashoknotebooks.base.BaseResponse
import com.breezeashoknotebooks.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}