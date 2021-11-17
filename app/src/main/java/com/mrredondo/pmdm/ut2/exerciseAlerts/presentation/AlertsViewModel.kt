package com.mrredondo.pmdm.ut2.exerciseAlerts.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mrredondo.pmdm.ut2.exerciseAlerts.app.RetroApiClient
import com.mrredondo.pmdm.ut2.exerciseAlerts.domain.GetAlertsUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AlertsViewModel(val getAlertsUseCase: GetAlertsUseCase) : ViewModel() {
    fun getAlertModel(): List<AlertViewState> {
        val alerts = getAlertsUseCase.execute()
        return alerts.map { alertModel ->
            AlertViewState(
                alertModel.id,
                alertModel.title,
                traductDate(alertModel.datePublished),
                alertModel.summary
            )
        }
    }

    fun traductDate(date: String): String {
        val year = date.substring(0, 4)
        val month = date.substring(5, 7)
        val day = date.substring(8, 10)
        val fecha = "$day-$month-$year"
        return fecha
    }

}