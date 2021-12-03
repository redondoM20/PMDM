package com.mrredondo.pmdm.ut2.ex06.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mrredondo.pmdm.R

class PlayerAdapter : RecyclerView.Adapter<PlayerViewHolder>() {
    private val dataSet = mutableListOf<PlayerViewState>()

    fun setItems(items: List<PlayerViewState>) {
        dataSet.clear()
        addItems(items.toMutableList())
    }

    fun addItems(items: MutableList<PlayerViewState>) {
        dataSet.addAll(items)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayerViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_item_ut02_ex06, parent, false)
        return PlayerViewHolder(view)
    }

    override fun onBindViewHolder(holder: PlayerViewHolder, position: Int) {
        holder.render(dataSet[position])
    }

    override fun getItemCount(): Int = dataSet.size
}