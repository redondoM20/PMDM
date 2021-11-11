package com.mrredondo.pmdm.ut2.exerciseAlerts.presentation

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.mrredondo.pmdm.databinding.ViewItemAlertsBinding

class AlertViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val bind = ViewItemAlertsBinding.bind(view)

    fun render(alertViewState: AlertViewState) {
        bind.labelTitle.text = alertViewState.alertTitle
        bind.labelDate.text = alertViewState.alertDate
        bind.labelSummary.text = alertViewState.alertSummary
    }
}