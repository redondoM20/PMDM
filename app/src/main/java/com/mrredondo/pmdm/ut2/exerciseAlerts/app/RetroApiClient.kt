package com.mrredondo.pmdm.ut2.exerciseAlerts.app

import com.mrredondo.pmdm.ut2.exerciseAlerts.data.remote.AlertApiModels
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetroApiClient : ApiClient {

    private val urlEndPoint: String = "https://plagricola.sitehub.es/api/public/alerts/"
    private val apiEndPoint: ApiEndPoint

    init {
        apiEndPoint = buildApiService()
    }

    private fun buildApiService(): ApiEndPoint {
        return buildClient().create(ApiEndPoint::class.java)
    }

    private fun buildClient(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(urlEndPoint)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    override fun getAlerts(): List<AlertApiModels> {
        val call = apiEndPoint.getAlerts()
        val response = call.execute()
        if (response.isSuccessful) {
            val alerts = response.body()
            return alerts ?: mutableListOf()
        } else {
            return mutableListOf()
        }
    }

}