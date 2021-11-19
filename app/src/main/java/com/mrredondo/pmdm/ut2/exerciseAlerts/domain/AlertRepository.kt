package com.mrredondo.pmdm.ut2.exerciseAlerts.domain

interface AlertRepository {
    fun getAlerts(): List<AlertModel>
    fun getAlert(id: String): AlertModel?
}