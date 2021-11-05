package com.mrredondo.pmdm.ut2.exerciseAlerts.data.remote

import com.mrredondo.pmdm.ut2.exerciseAlerts.domain.AlertModel
import com.mrredondo.pmdm.ut2.exerciseAlerts.domain.FileEntity

data class AlertApiModels(
    val id: String,
    val title: String,
    val type: Int,
    val summary: String,
    val datePublished: String,
    val body: String,
    val source: String,
    val files: List<FileEntity>
) {
    fun toDomainModel(): AlertModel = AlertModel(
        id, title, type, summary, datePublished, body, source, files
    )

}