package com.mrredondo.pmdm.ut2.ex06.domain

class SavePlayerUseCase(private val repository: PlayerDataRepository) {
    fun execute(playerModel: PlayerModel) = repository.save(playerModel)
}