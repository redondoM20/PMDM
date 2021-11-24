package com.mrredondo.pmdm.ut2.exerciseAlerts.data.remote

import com.mrredondo.pmdm.ut2.exerciseAlerts.domain.AlertModel
import com.mrredondo.pmdm.ut2.exerciseAlerts.domain.FileModel

data class AlertApiModels(
    val alert_id: String,
    val title: String,
    val type: Int,
    val summary: String,
    val date: String,
    val body: String?,
    val source: String?,
    val files: List<FileModel>?
) {
    fun toDomainModel() = AlertModel(
        alert_id, title, type, summary, date, body ?: "", source ?: "", mutableListOf()
    )

}