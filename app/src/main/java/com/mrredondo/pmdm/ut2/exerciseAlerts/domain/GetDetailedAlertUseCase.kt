package com.mrredondo.pmdm.ut2.exerciseAlerts.domain

class GetDetailedAlertUseCase(private val detaileAlertRepository: AlertRepository) {
    fun execute(alertId: String): AlertModel? = detaileAlertRepository.getAlert(alertId)
}