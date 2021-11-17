package com.mrredondo.pmdm.ut2.exerciseAlerts.domain

class GetAlertsUseCase(private val alertRepository: AlertRepository) {
    fun execute(): List<AlertModel> = alertRepository.getAlertsAll()
}