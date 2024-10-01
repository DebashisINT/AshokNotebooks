package com.breezeashoknotebooks.features.newcollection.model

import com.breezeashoknotebooks.app.domain.CollectionDetailsEntity
import com.breezeashoknotebooks.base.BaseResponse
import com.breezeashoknotebooks.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}