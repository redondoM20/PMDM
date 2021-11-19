package com.mrredondo.pmdm.ut2.exerciseAlerts.data

import com.mrredondo.pmdm.ut2.exerciseAlerts.data.remote.AlertRemoteSource
import com.mrredondo.pmdm.ut2.exerciseAlerts.domain.AlertModel
import com.mrredondo.pmdm.ut2.exerciseAlerts.domain.AlertRepository

class AlertDataRepository(private val alertRemote: AlertRemoteSource) : AlertRepository {


    override fun getAlerts(): List<AlertModel> {
        return alertRemote.getAlerts()
    }

    override fun getAlert(id: String): AlertModel? =
        alertRemote.getAlert(id)

}