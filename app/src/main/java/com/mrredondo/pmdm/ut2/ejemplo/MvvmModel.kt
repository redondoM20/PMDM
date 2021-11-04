package com.alvarolc.pmpd_playground.Mvvm.domain

import java.util.*

data class MvvmModel(
    val id: Int,
    val title: String,
    val description: String,
    val mvvmDetailsModel: MvvmDetailsModel
) {
}

data class MvvmDetailsModel(val longDescription: String, val startDate: Date)