package com.breezeashoknotebooks.features.login.model.productlistmodel

import com.breezeashoknotebooks.app.domain.NewOrderScrOrderEntity
import com.breezeashoknotebooks.app.domain.ProductListEntity

class NewOdrScrOrderListModel {
    var status:String? = null
    var message:String? = null
    var user_id:String? = null
    var order_list: ArrayList<NewOrderScrOrderEntity>? = null
}