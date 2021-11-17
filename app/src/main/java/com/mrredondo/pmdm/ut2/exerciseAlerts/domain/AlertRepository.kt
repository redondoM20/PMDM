package com.mrredondo.pmdm.ut2.exerciseAlerts.domain

interface AlertRepository {
    fun getAlertsAll(): List<AlertModel>
}