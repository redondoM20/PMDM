package com.mrredondo.pmdm.ut2.ex06.presentation

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.mrredondo.pmdm.R
import com.mrredondo.pmdm.databinding.ActivityUt02Ex06Binding

class Ut02Ex06Activity : AppCompatActivity() {

    private val bind: ActivityUt02Ex06Binding by lazy {
        ActivityUt02Ex06Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupView()
    }

    private fun setupView() {
        setupViewBinding()
        setupCustomToolbar()
    }

    private fun setupViewBinding() {
        setContentView(bind.root)
    }

    private fun setupCustomToolbar() {
        bind.mainBar.visibility = View.GONE
        bind.viewCustomToolbar.customToolbar.visibility = View.VISIBLE

        bind.viewCustomToolbar.title.text = getString(R.string.app_name)
        bind.viewCustomToolbar
    }


}