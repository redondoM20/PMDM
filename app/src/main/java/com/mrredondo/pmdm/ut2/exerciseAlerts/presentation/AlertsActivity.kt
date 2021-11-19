package com.mrredondo.pmdm.ut2.exerciseAlerts.presentation

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.mrredondo.pmdm.databinding.ActivityAlertsBinding
import com.mrredondo.pmdm.ut2.exerciseAlerts.app.RetroApiClient
import com.mrredondo.pmdm.ut2.exerciseAlerts.data.AlertDataRepository
import com.mrredondo.pmdm.ut2.exerciseAlerts.data.remote.AlertRemoteSource
import com.mrredondo.pmdm.ut2.exerciseAlerts.domain.GetAlertsUseCase

class AlertsActivity : AppCompatActivity() {

    private val TAG = AlertsActivity::class.java.simpleName
    private val viewModel =
        AlertsViewModel(GetAlertsUseCase(AlertDataRepository(AlertRemoteSource(RetroApiClient()))))
    private val alertAdapter = AlertAdapter()

    private val bind: ActivityAlertsBinding by lazy {
        ActivityAlertsBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(bind.root)
        setupView()
        //exerciseRecycledView()
        getAlerts()
    }

    private fun setupView() {
        bind.listAlerts.adapter = alertAdapter
        bind.listAlerts.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }

    private fun exerciseRecycledView() {
        val alerts = viewModel.getAlertModel()
        alertAdapter.setItems(alerts)
    }

    private fun getAlerts() {
        Thread {
            val alerts = viewModel.getAlertModel()
            Log.i(TAG, "$alerts")
            runOnUiThread {
                alertAdapter.setItems(alerts)
            }
        }.start()
    }

}