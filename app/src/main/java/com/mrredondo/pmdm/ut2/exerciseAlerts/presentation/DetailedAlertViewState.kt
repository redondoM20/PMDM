package com.mrredondo.pmdm.ut2.exerciseAlerts.presentation


data class DetailedAlertViewState(
    val alertId: String,
    val alertTitle: String,
    val alertFiles: List<FileAlertViewState>,
    val alertBody: String
)