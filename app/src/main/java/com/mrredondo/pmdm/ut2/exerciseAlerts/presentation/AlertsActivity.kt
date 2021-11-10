package com.mrredondo.pmdm.ut2.exerciseAlerts.presentation

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatImageView
import com.mrredondo.pmdm.R
import com.mrredondo.pmdm.databinding.ActivityAlertsBinding
import com.mrredondo.pmdm.ut2.exerciseAlerts.app.MockApiClient
import com.mrredondo.pmdm.ut2.exerciseAlerts.data.AlertDataRepository
import com.mrredondo.pmdm.ut2.exerciseAlerts.data.remote.AlertRemoteSource
import com.mrredondo.pmdm.ut2.exerciseAlerts.domain.GetAlertsUseCase

class AlertsActivity : AppCompatActivity() {

    private val TAG: String = AlertsActivity::class.java.name
    private lateinit var viewBinding: ActivityAlertsBinding

    private val viewModel: AlertsViewModel =
        AlertsViewModel(GetAlertsUseCase(AlertDataRepository(AlertRemoteSource(MockApiClient()))))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val layoutInflater = LayoutInflater.from(this)
        viewBinding = ActivityAlertsBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        setupView()
        render()
    }

    private fun setupView() {


        imageIconAlert()
    }

    private fun imageIconAlert() {
        val image: AppCompatImageView = findViewById(R.id.iconAlert)
        image.setImageResource(R.drawable.ic_launcher_foreground)
    }

    private fun render() {
        val alertModel = viewModel.getAlertModel()
        Log.d(TAG, "$alertModel")

        viewBinding.titleAlert.text = alertModel[0].title
        viewBinding.dateAlert.text = alertModel[0].datePublished
        viewBinding.resumeAlert.text = alertModel[0].summary

    }
}