package com.breezeashoknotebooks.features.viewAllOrder.interf

import com.breezeashoknotebooks.app.domain.NewOrderProductEntity
import com.breezeashoknotebooks.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}