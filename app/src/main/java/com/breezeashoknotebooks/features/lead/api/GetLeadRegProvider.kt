package com.breezeashoknotebooks.features.lead.api

import com.breezeashoknotebooks.features.NewQuotation.api.GetQuotListRegRepository
import com.breezeashoknotebooks.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}