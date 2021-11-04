package com.alvarolc.pmpd_playground.Mvvm.domain

class GetMvvmUseCase(val mvvmRepository: MvvmRepository) {

    fun execute(paramsIn: String): MvvmModel {
        val model = mvvmRepository.getMvvm()
        return model
    }
}