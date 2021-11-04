package com.mrredondo.pmdm.ut2.exerciseAlerts.data

import com.mrredondo.pmdm.ut2.exerciseAlerts.domain.AlertModel
import com.mrredondo.pmdm.ut2.exerciseAlerts.domain.AlertRepository
import com.mrredondo.pmdm.ut2.exerciseAlerts.domain.FileEntity

class AlertDataRepository : AlertRepository {


    override fun getAlertsAll(): List<AlertModel> =
        mutableListOf(
            AlertModel(
                "1",
                "title 01",
                1,
                "summary 01",
                "2021-01-01",
                "body 1",
                "source 01",
                mutableListOf(
                    FileEntity("name 01", "url 01")
                )
            ),
            AlertModel(
                "2",
                "title 01",
                1,
                "summary 01",
                "2021-01-01",
                "body 1",
                "source 01",
                mutableListOf(
                    FileEntity("name 01", "url 01")
                )
            ),
            AlertModel(
                "3",
                "title 01",
                1,
                "summary 01",
                "2021-01-01",
                "body 1",
                "source 01",
                mutableListOf(
                    FileEntity("name 01", "url 01")
                )
            )
        )
}