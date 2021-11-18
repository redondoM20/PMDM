package com.mrredondo.pmdm.ut2.exerciseAlerts.app

import com.mrredondo.pmdm.ut2.exerciseAlerts.data.remote.AlertApiModels
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiEndPoint {
    @GET("alerts")
    fun getAlerts(): Call<ApiResponse<List<AlertApiModels>>>

    @GET("alert/{alert_id}")
    fun getAlert(@Path("alert_id") alert_id: String): Call<ApiResponse<AlertApiModels>>
}