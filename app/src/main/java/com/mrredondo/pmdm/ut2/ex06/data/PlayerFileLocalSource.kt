package com.mrredondo.pmdm.ut2.ex06.data

import com.mrredondo.pmdm.commons.serializer.JsonSerializer
import com.mrredondo.pmdm.ut2.ex06.domain.PlayerModel
import com.mrredondo.pmdm.ut2.ex06.presentation.Ut02Ex06Activity
import java.io.File

class PlayerFileLocalSource(
    private val activity: Ut02Ex06Activity,
    private val serializer: JsonSerializer
) {

    private val playerFile: File by lazy { buildFile() }

    fun save(playerModel: PlayerModel) {
        val players = fetch().toMutableList()
        players.add(playerModel)
        clearFile()
        players.map { playerModel ->
            playerFile.appendText(
                serializer.toJson(
                    playerModel,
                    PlayerModel::class.java
                ) + System.lineSeparator()
            )
        }
    }

    fun fetch(): List<PlayerModel> {
        val players: MutableList<PlayerModel> = mutableListOf()
        val lines = playerFile.readLines()
        lines.map { line ->
            val playerModel = serializer.fromJson(line, PlayerModel::class.java)
            players.add(playerModel)
        }
        return players
    }

    private fun clearFile() {
        playerFile.writeText("")
    }

    private fun buildFile(): File {
        val file = File(activity.filesDir, PLAYERS_FILENAME)
        if (!file.exists()) {
            file.createNewFile()
        }
        return file
    }

    companion object {
        const val PLAYERS_FILENAME: String = "aad_players.txt"
    }
}