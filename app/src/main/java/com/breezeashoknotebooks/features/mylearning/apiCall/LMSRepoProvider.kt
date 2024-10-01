package com.breezeashoknotebooks.features.mylearning.apiCall

import com.breezeashoknotebooks.features.login.api.opportunity.OpportunityListApi
import com.breezeashoknotebooks.features.login.api.opportunity.OpportunityListRepo

object LMSRepoProvider {
    fun getTopicList(): LMSRepo {
        return LMSRepo(LMSApi.create())
    }
}