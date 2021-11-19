package com.mrredondo.pmdm.ut2.exerciseAlerts.presentation

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.mrredondo.pmdm.databinding.ActivitySecondBinding
import com.mrredondo.pmdm.ut2.exerciseAlerts.app.RetroApiClient
import com.mrredondo.pmdm.ut2.exerciseAlerts.data.AlertDataRepository
import com.mrredondo.pmdm.ut2.exerciseAlerts.data.remote.AlertRemoteSource
import com.mrredondo.pmdm.ut2.exerciseAlerts.domain.GetDetailedAlertUseCase

class SecondActivity : AppCompatActivity() {

    private val TAG = SecondActivity::class.java.simpleName
    private val viewModel = DetailedAlertViewModel(
        GetDetailedAlertUseCase(
            AlertDataRepository(
                AlertRemoteSource(RetroApiClient())
            )
        )
    )
    private val fileAdapter = FileAlertAdapter()


    private val bind: ActivitySecondBinding by lazy {
        ActivitySecondBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(bind.root)
        getAlert()
    }

    private fun setupView() {
        bind.alertFiles.adapter = fileAdapter
        bind.alertFiles.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }

    companion object {
        private val KEY_ALERT_ID = "key_alert_id"

        fun getIntent(context: Context, alertId: String): Intent {
            val intent = Intent(context, SecondActivity::class.java)
            intent.putExtra(KEY_ALERT_ID, alertId)
            return intent
        }
    }

    private fun getAlertId(): String =
        intent.extras!!.getString(KEY_ALERT_ID, "0")

    private fun getAlert() {
        val alertId = getAlertId()
        Log.d(TAG, alertId)
        Thread {
            var alert = viewModel.getDetailedModel(alertId)
            Log.d(TAG, "$alert")
            runOnUiThread {
                if (alert != null) {
                    bind.alertTitle.text = alert.alertTitle
                    bind.alertContent.text = alert.alertBody
                    setupView()
                }
            }
        }.start()

    }

}