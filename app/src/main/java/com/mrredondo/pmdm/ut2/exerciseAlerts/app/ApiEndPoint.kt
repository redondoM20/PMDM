package com.mrredondo.pmdm.ut2.exerciseAlerts.app

import com.mrredondo.pmdm.ut2.exerciseAlerts.data.remote.AlertApiModels
import retrofit2.Call
import retrofit2.http.GET

interface ApiEndPoint {
    @GET("alerts")
    fun getAlerts(): Call<ApiResponse<List<AlertApiModels>>>
}