package com.mrredondo.pmdm.ut2.EX02.presentation

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.mrredondo.pmdm.databinding.ViewItemUt02Ex02Binding

class UserViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val bind = ViewItemUt02Ex02Binding.bind(view)

    fun render(userViewState: UserViewState) {
        bind.labelName.text = userViewState.fullName
        bind.labelAge.text = userViewState.age
    }
}