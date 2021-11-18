package com.mrredondo.pmdm.ut2.exerciseAlerts.data.remote

import com.mrredondo.pmdm.ut2.exerciseAlerts.app.ApiClient
import com.mrredondo.pmdm.ut2.exerciseAlerts.domain.AlertModel

class AlertRemoteSource(private val apiClient: ApiClient) {
    fun getAlerts(): List<AlertModel> {
        val alertApiModel = apiClient.getAlerts()
        return alertApiModel.map { apiModel -> apiModel.toDomainModel() }
    }

    fun getAlert(alert_id: String): AlertModel {
        val alertApiModel = apiClient.getAlert(alert_id)
        return alertApiModel!!.toDomainModel()
    }

}