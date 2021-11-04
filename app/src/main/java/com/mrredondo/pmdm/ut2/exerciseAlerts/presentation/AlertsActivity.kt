package com.mrredondo.pmdm.ut2.exerciseAlerts.presentation

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatImageView
import com.mrredondo.pmdm.R
import com.mrredondo.pmdm.databinding.ActivityAlertsBinding
import com.mrredondo.pmdm.ut2.exerciseAlerts.data.AlertDataRepository
import com.mrredondo.pmdm.ut2.exerciseAlerts.domain.GetAlertsUseCase

class AlertsActivity : AppCompatActivity() {

    private val TAG: String = AlertsActivity::class.java.name

    private lateinit var viewBinding: ActivityAlertsBinding

    private val viewModel: AlertsViewModel =
        AlertsViewModel(GetAlertsUseCase(AlertDataRepository()))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alerts)
        setupView()
        render()
    }

    private fun setupView() {
        val layoutInflater = LayoutInflater.from(this)
        viewBinding = ActivityAlertsBinding.inflate(layoutInflater)

        imageIconAlert()
        imageIconAlert1()
        imageIconAlert2()
    }

    private fun imageIconAlert() {
        val image: AppCompatImageView = findViewById(R.id.iconAlert)
        image.setImageResource(R.drawable.ic_launcher_foreground)
    }

    private fun imageIconAlert1() {
        val image: AppCompatImageView = findViewById(R.id.iconAlert1)
        image.setImageResource(R.drawable.ic_launcher_foreground)
    }

    private fun imageIconAlert2() {
        val image: AppCompatImageView = findViewById(R.id.iconAlert2)
        image.setImageResource(R.drawable.ic_launcher_foreground)
    }

    private fun render() {
        val alertModel = viewModel.getAlertModel()
        Log.d(TAG, "$alertModel")

        viewBinding.titleAlert.text = alertModel[0].title
        viewBinding.dateAlert.text = alertModel[0].datePublished
        viewBinding.resumeAlert.text = alertModel[0].summary

        /*viewBinding.titleAlert1.text = alertModel[1].title
        viewBinding.dateAlert1.text = alertModel[1].datePublished
        viewBinding.resumeAlert1.text = alertModel[1].summary

        viewBinding.titleAlert2.text = alertModel[2].title
        viewBinding.dateAlert2.text = alertModel[2].datePublished
        viewBinding.resumeAlert2.text = alertModel[2].summary*/

    }
}