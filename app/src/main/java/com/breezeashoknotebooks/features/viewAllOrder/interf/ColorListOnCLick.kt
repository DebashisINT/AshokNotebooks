package com.breezeashoknotebooks.features.viewAllOrder.interf

import com.breezeashoknotebooks.app.domain.NewOrderGenderEntity
import com.breezeashoknotebooks.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}