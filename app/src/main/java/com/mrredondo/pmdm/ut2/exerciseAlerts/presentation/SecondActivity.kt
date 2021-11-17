package com.mrredondo.pmdm.ut2.exerciseAlerts.presentation

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.mrredondo.pmdm.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    companion object {
        private val KEY_USER_ID = "key_user_id"

        fun getIntent(context: Context, userId: Int): Intent {
            val intent = Intent(context, SecondActivity::class.java)
            intent.putExtra(KEY_USER_ID, userId)
            return intent
        }
    }

    private fun getAlertId(): String =
        intent.extras!!.getString(KEY_USER_ID, "0")



}