package com.mrredondo.pmdm.ut2.exerciseAlerts.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mrredondo.pmdm.R

class AlertAdapter : RecyclerView.Adapter<AlertViewHolder>() {
    private val dataSet: MutableList<AlertViewState> = mutableListOf()

    fun setItems(items: List<AlertViewState>) {
        dataSet.clear()
        addItems(items)
    }

    private fun addItems(items: List<AlertViewState>) {
        dataSet.addAll(items)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlertViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.view_item_alerts, parent, false)
        return AlertViewHolder(view)
    }

    override fun onBindViewHolder(holder: AlertViewHolder, position: Int) {
        holder.render(dataSet[position])
    }

    override fun getItemCount(): Int = dataSet.size


}