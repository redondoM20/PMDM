package com.mrredondo.pmdm.ut2.exerciseAlerts.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mrredondo.pmdm.ut2.exerciseAlerts.domain.GetAlertsUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AlertsViewModel(
    val getAlertsUseCase: GetAlertsUseCase
) : ViewModel() {

    val alertsViewState: LiveData<List<AlertViewState>>
        get() = _alertsViewState

    private val _alertsViewState: MutableLiveData<List<AlertViewState>> by lazy {
        MutableLiveData<List<AlertViewState>>()
    }

    fun loadAlertsWithCoroutines() = viewModelScope.launch(Dispatchers.Main) {
        val alerts = getAlertsUseCase.execute()

        _alertsViewState.value = alerts.map { alertModel ->
            AlertViewState(
                alertModel.id,
                alertModel.title,
                traductDate(alertModel.datePublished),
                alertModel.summary
            )
        }
    }

    /*fun getAlertModel(): List<AlertViewState> {
        val alerts = getAlertsUseCase.execute()
        return alerts.map { alertModel ->
            AlertViewState(
                alertModel.id,
                alertModel.title,
                traductDate(alertModel.datePublished),
                alertModel.summary
            )
        }
    }*/


    fun traductDate(date: String): String {
        val year = date.substring(0, 4)
        val month = date.substring(5, 7)
        val day = date.substring(8, 10)
        val fecha = "$day-$month-$year"
        return fecha
    }

}