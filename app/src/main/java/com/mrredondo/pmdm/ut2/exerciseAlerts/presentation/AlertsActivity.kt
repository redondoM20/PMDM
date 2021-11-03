package com.mrredondo.pmdm.ut2.exerciseAlerts.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView
import com.mrredondo.pmdm.R

class AlertsActivity : AppCompatActivity() {

    private val TAG: String = AlertsActivity::class.java.name
    private val alertsViewModel = AlertsViewModel()

    private lateinit var titleAlert: AppCompatTextView
    private lateinit var dateAlert: AppCompatTextView
    private lateinit var resumeAlert: AppCompatTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alerts)
    }

    private fun setupView() {

    }
}