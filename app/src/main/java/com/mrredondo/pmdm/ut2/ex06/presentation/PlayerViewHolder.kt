package com.mrredondo.pmdm.ut2.ex06.presentation

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.mrredondo.pmdm.databinding.ViewItemUt02Ex06Binding
import com.mrredondo.pmdm.ut2.ex06.domain.PlayerModel

class PlayerViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    private val bind = ViewItemUt02Ex06Binding.bind(view)

    fun render(playerModel: PlayerModel) {
        bind.nameLabel.text = "${playerModel.name} ${playerModel.surname}"
        bind.ccaaLabel.text = playerModel.ccaa
        bind.genderLabel.text = playerModel.sexo
        var positionsString = ""
        playerModel.position.forEach { position ->
            positionsString += "$position \n"
        }
        bind.positions.text = positionsString
    }
}
