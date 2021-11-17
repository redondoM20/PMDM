package com.mrredondo.pmdm.ut2.exerciseAlerts.app

import com.mrredondo.pmdm.ut2.exerciseAlerts.data.remote.AlertApiModels

interface ApiClient {
    fun getAlerts(): List<AlertApiModels>
}