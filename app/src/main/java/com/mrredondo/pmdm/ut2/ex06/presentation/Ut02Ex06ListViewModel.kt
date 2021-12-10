package com.mrredondo.pmdm.ut2.ex06.presentation

import androidx.lifecycle.ViewModel
import com.mrredondo.pmdm.ut2.ex06.domain.GetPlayersUseCase

class Ut02Ex06ListViewModel(private val getPlayersUseCase: GetPlayersUseCase) : ViewModel() {
    fun getPlayers(): PlayersViewState {
        val players = getPlayersUseCase.execute()
        return PlayersViewState(players)
    }
}