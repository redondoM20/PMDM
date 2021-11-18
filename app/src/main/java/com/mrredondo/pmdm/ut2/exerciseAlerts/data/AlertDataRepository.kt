package com.mrredondo.pmdm.ut2.exerciseAlerts.data

import com.mrredondo.pmdm.ut2.exerciseAlerts.data.remote.AlertRemoteSource
import com.mrredondo.pmdm.ut2.exerciseAlerts.domain.AlertModel
import com.mrredondo.pmdm.ut2.exerciseAlerts.domain.AlertRepository

class AlertDataRepository(private val alertRemote: AlertRemoteSource) : AlertRepository {


    override fun getAlertsAll(): List<AlertModel> {
        val remoteModel = alertRemote.getAlerts()
        return remoteModel
    }

    override fun getAlert(id: String): AlertModel {
        val remoteModel = alertRemote.getAlert(id)
        return remoteModel
    }

}