package com.mrredondo.pmdm.ut2.ex06.domain

import com.mrredondo.pmdm.ut2.ex06.data.PlayerFileLocalSource

class PlayerDataRepository(private val playerFileLocalSource: PlayerFileLocalSource) {
    fun fetchAll(): List<PlayerModel> {
        var players = playerFileLocalSource.fetch()
        return players
    }

    fun save(playerModel: PlayerModel) {
        playerFileLocalSource.save(playerModel)
    }
}