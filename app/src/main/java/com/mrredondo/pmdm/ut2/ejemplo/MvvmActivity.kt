package com.alvarolc.pmpd_playground.Mvvm.presentation

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.mrredondo.pmdm.R

class MvvmActivity : AppCompatActivity() {

    private val viewModel: MvvmViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alerts)
    }

    private fun render() {
        val mvvmModel = viewModel.getAllMvvm()
    }
}