package com.mrredondo.pmdm.ut2.exerciseAlerts.presentation

import androidx.lifecycle.ViewModel
import com.mrredondo.pmdm.ut2.exerciseAlerts.domain.GetDetailedAlertUseCase

class DetailedAlertViewModel(val getDetailedAlertUseCase: GetDetailedAlertUseCase) : ViewModel() {

    fun getDetailedModel(alertId: String): DetailedAlertViewState? {
        val alert = getDetailedAlertUseCase.execute(alertId)
        alert?.let {
            return DetailedAlertViewState(
                it.id,
                it.title,
                it.files.map { fileModel -> FileAlertViewState(fileModel.id, fileModel.name) },
                it.body
            )
        }
        return null
    }
}