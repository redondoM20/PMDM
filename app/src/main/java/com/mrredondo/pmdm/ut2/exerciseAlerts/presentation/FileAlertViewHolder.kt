package com.mrredondo.pmdm.ut2.exerciseAlerts.presentation

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.mrredondo.pmdm.databinding.ViewItemAlertFilesBinding

class FileAlertViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    private val bind = ViewItemAlertFilesBinding.bind(view)

    fun render(fileAlertViewState: FileAlertViewState) {
        bind.nameFileAlert.text = fileAlertViewState.fileName
    }
}