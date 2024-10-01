package com.breezeashoknotebooks.features.activities.api

import com.breezeashoknotebooks.features.member.api.TeamApi
import com.breezeashoknotebooks.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}