package com.mrredondo.pmdm.ut2.ex06.domain

import com.mrredondo.pmdm.ut2.ex06.data.PlayerDataRepository

class GetPlayersUseCase(private val repository: PlayerDataRepository) {
    fun execute(): List<PlayerModel> = repository.fetchAll()
}