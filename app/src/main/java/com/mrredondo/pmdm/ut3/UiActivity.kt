package com.mrredondo.pmdm.ut3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import com.mrredondo.pmdm.R

class UiActivity : AppCompatActivity() {

    private val TAG: String = UiActivity::class.java.name
    private val uiViewModel = UiViewModel()

    private lateinit var titleView: AppCompatTextView
    private lateinit var textSubtitlePlate: AppCompatTextView
    private lateinit var textTime: AppCompatTextView
    private lateinit var textDistance: AppCompatTextView
    private lateinit var textPrice: AppCompatTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_ut3_tgtg_linearlayout)
        setupView()
        render()
    }

    private fun setupView() {
        //Recoger los de texto
        titleView = findViewById(R.id.title01)
        textSubtitlePlate = findViewById(R.id.title02)
        textTime = findViewById(R.id.time)
        textDistance = findViewById(R.id.distance)
        textPrice = findViewById(R.id.price)

        //Añadir imagenes
        imageBackground()
        imageIconDistance()
        imageIconTime()
    }


    private fun imageBackground() {
        val image: AppCompatImageView = findViewById(R.id.fondo01)
        image.setImageResource(R.drawable.ic_recipes)
    }

    private fun imageIconTime() {
        val image: AppCompatImageView = findViewById(R.id.icon01)
        image.setImageResource(R.drawable.ic_clock)
    }

    private fun imageIconDistance() {
        val image: AppCompatImageView = findViewById(R.id.icon02)
        image.setImageResource(R.drawable.ic_location)
    }

    private fun render() {
        val uiModel = uiViewModel.getFoodModel()
        titleView.setText(uiModel.titleFood)
        textSubtitlePlate.setText(uiModel.subtitleFood)
        textTime.setText(uiModel.labelTimeFood)
        textDistance.setText(uiModel.labelDistanceFood)
        textPrice.setText(uiModel.labelPriceFood)
    }
}