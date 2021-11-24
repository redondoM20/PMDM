package com.mrredondo.pmdm.ut2.ex06.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mrredondo.pmdm.R
import com.mrredondo.pmdm.databinding.ActivityUt02Ex06Binding

class Ut02Ex06Activity : AppCompatActivity() {

    private val bind: ActivityUt02Ex06Binding by lazy {
        ActivityUt02Ex06Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ut02_ex06)
    }


}