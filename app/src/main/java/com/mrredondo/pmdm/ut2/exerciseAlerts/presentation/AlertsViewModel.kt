package com.mrredondo.pmdm.ut2.exerciseAlerts.presentation

import androidx.lifecycle.ViewModel
import com.mrredondo.pmdm.ut2.exerciseAlerts.domain.GetAlertsUseCase

class AlertsViewModel(val getAlertsUseCase: GetAlertsUseCase) : ViewModel() {
    fun getAlertModel() = getAlertsUseCase.execute()
}