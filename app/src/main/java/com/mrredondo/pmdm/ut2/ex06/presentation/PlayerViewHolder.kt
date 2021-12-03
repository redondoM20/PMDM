package com.mrredondo.pmdm.ut2.ex06.presentation

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.mrredondo.pmdm.databinding.ViewItemUt02Ex06Binding

class PlayerViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    private val bind = ViewItemUt02Ex06Binding.bind(view)

    fun render(playerViewState: PlayerViewState) {
        bind.nameLabel.text = "${playerViewState.name} ${playerViewState.surname}"
        bind.ccaaLabel.text = playerViewState.ccaa
        bind.genderLabel.text = playerViewState.gender
        var positionString = ""
        playerViewState.position.forEach {
            positionString += "$it \n"
        }
        bind.positions.text = positionString
    }
}