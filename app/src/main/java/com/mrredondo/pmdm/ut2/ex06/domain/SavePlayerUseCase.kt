package com.mrredondo.pmdm.ut2.ex06.domain

import com.mrredondo.pmdm.ut2.ex06.data.PlayerDataRepository

class SavePlayerUseCase(private val repository: PlayerDataRepository) {
    fun execute(playerModel: PlayerModel) = repository.save(playerModel)
}