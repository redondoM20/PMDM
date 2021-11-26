package com.mrredondo.pmdm.ut2.ex06.domain

class GetPlayersUseCase(private val repository: PlayerDataRepository) {
    fun execute(): List<PlayerModel> = repository.fetchAll()
}