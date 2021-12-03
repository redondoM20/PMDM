package com.mrredondo.pmdm.ut2.ex06.data

import com.mrredondo.pmdm.ut2.ex06.domain.PlayerModel

class PlayerDataRepository(private val playerFileLocalSource: PlayerFileLocalSource) {
    fun fetchAll(): List<PlayerModel> {
        return playerFileLocalSource.fetch()
    }

    fun save(playerModel: PlayerModel) {
        playerFileLocalSource.save(playerModel)
    }
}