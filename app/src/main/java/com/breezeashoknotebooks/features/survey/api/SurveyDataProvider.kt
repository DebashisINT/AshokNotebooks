package com.breezeashoknotebooks.features.survey.api

import com.breezeashoknotebooks.features.photoReg.api.GetUserListPhotoRegApi
import com.breezeashoknotebooks.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}