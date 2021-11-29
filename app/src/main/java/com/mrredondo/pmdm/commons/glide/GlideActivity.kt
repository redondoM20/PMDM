package com.mrredondo.pmdm.commons.glide

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.mrredondo.pmdm.R

class GlideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_glide)
        loadImage()
    }

    private fun loadImage() {
        val url =
            "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f8/San_Mames%2C_Bilbao%2C_Euskal_Herria_-_Basque_Country.jpg/1024px-San_Mames%2C_Bilbao%2C_Euskal_Herria_-_Basque_Country.jpg"

        val imageView = findViewById<ImageView>(R.id.logo_athletic)

        imageView.fromUrl(url)
    }
}