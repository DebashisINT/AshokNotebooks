package com.breezeashoknotebooks.features.document.api

import com.breezeashoknotebooks.features.dymanicSection.api.DynamicApi
import com.breezeashoknotebooks.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}