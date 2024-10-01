package com.breezeashoknotebooks.features.viewAllOrder.model

import com.breezeashoknotebooks.app.domain.NewOrderColorEntity
import com.breezeashoknotebooks.app.domain.NewOrderGenderEntity
import com.breezeashoknotebooks.app.domain.NewOrderProductEntity
import com.breezeashoknotebooks.app.domain.NewOrderSizeEntity
import com.breezeashoknotebooks.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

