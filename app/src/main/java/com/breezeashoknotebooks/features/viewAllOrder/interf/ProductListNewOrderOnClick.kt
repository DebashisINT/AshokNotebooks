package com.breezeashoknotebooks.features.viewAllOrder.interf

import com.breezeashoknotebooks.app.domain.NewOrderGenderEntity
import com.breezeashoknotebooks.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}