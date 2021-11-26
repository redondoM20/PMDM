package com.mrredondo.pmdm.ut2.ex06.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mrredondo.pmdm.ut2.ex06.domain.GetPlayersUseCase

class Ut02Ex06ListViewModel(private val getPlayersUseCase: GetPlayersUseCase) : ViewModel() {
    private val _players: MutableLiveData<PlayerViewState> by lazy {
        MutableLiveData<PlayerViewState>()
    }

    val playerObservable: LiveData<PlayerViewState>
        get() = _players
}