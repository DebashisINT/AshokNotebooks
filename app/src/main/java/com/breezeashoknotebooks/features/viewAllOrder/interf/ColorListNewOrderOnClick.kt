package com.breezeashoknotebooks.features.viewAllOrder.interf

import com.breezeashoknotebooks.app.domain.NewOrderColorEntity
import com.breezeashoknotebooks.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}