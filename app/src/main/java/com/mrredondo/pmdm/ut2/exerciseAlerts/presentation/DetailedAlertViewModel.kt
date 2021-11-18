package com.mrredondo.pmdm.ut2.exerciseAlerts.presentation

import androidx.lifecycle.ViewModel
import com.mrredondo.pmdm.ut2.exerciseAlerts.domain.GetDetailedAlertUseCase

class DetailedAlertViewModel(val getDetailedAlertUseCase: GetDetailedAlertUseCase) : ViewModel() {
    fun getDetailedModel(alertId: String): DetailedAlertViewState {
        val alert = getDetailedAlertUseCase.execute(alertId)
        return DetailedAlertViewState(
            alert.id,
            alert.title,
            alert.files.map { fileModel -> FileAlertViewState(fileModel.id, fileModel.name) },
            alert.body
        )
    }
}