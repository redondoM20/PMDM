package com.mrredondo.pmdm.ut2.exerciseAlerts.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mrredondo.pmdm.R

class FileAlertAdapter : RecyclerView.Adapter<FileAlertViewHolder>() {
    private val dataSet: MutableList<FileAlertViewState> = mutableListOf()

    fun setItems(items: List<FileAlertViewState>) {
        dataSet.clear()
        addItems(items)
    }

    private fun addItems(items: List<FileAlertViewState>) {
        dataSet.addAll(items)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FileAlertViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_item_alert_files, parent, false)
        return FileAlertViewHolder(view)
    }

    override fun onBindViewHolder(holder: FileAlertViewHolder, position: Int) {
        holder.render(dataSet[position])
    }

    override fun getItemCount(): Int = dataSet.size
}