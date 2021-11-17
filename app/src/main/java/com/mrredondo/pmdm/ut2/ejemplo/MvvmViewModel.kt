package com.alvarolc.pmpd_playground.Mvvm.presentation

import androidx.lifecycle.ViewModel
import com.alvarolc.pmpd_playground.Mvvm.domain.GetMvvmUseCase

class MvvmViewModel(val getMvvmUseCase: GetMvvmUseCase) : ViewModel() {

    fun getAllMvvm() = getMvvmUseCase.execute("1")

}