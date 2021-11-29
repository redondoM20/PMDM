package com.mrredondo.pmdm.ut2.ex06.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mrredondo.pmdm.ut2.ex06.domain.PlayerModel
import com.mrredondo.pmdm.ut2.ex06.domain.SavePlayerUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class Ut02Ex06FormViewModel(private val savePlayerUseCase: SavePlayerUseCase) : ViewModel() {

    fun savePlayer(playerModel: PlayerModel) = viewModelScope.launch(Dispatchers.Main) {
        savePlayerUseCase.execute(playerModel)
    }

}