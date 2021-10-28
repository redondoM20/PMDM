package com.mrredondo.pmdm.ut3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.ContextCompat
import com.mrredondo.pmdm.R

class UiActivity : AppCompatActivity() {

    private val TAG: String = UiActivity::class.java.name

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_ut3_tgtg_linearlayout)
        initPlayGround()
    }

    private fun initPlayGround() {
        textDistance()
        textPrice()
        textSubtitlePlate()
        textTime()
        textTitleCategory()
        imageBackground()
        imageIconDistance()
        imageIconTime()
    }

    private fun textTitleCategory() {
        val textView: AppCompatTextView = findViewById(R.id.title01)
        textView.text = getString(R.string.titleCategory)
    }

    private fun textSubtitlePlate() {
        val textView: AppCompatTextView = findViewById(R.id.title02)
        textView.text = getString(R.string.strawberry_frosted_layer_cake)
    }

    private fun textTime() {
        val textView: AppCompatTextView = findViewById(R.id.time)
        textView.text = getString(R.string.hoy_21_00_21_30)
    }

    private fun textDistance() {
        val textView: AppCompatTextView = findViewById(R.id.distance)
        textView.text = getString(R.string._1_5km)
    }

    private fun textPrice() {
        val textView: AppCompatTextView = findViewById(R.id.price)
        textView.text = getString(R.string._2_99)
        textView.setTextColor(ContextCompat.getColor(this, R.color.teal_700))
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
}