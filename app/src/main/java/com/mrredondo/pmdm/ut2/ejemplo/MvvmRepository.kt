package com.alvarolc.pmpd_playground.Mvvm.domain

interface MvvmRepository {

    fun getMvvm(): MvvmModel
    fun saveMvvm(MvvmModel: MvvmModel)
    fun removeMvvm(id: String)
    fun getMvvmAll(): List<MvvmModel>
}