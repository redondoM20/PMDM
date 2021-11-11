package com.mrredondo.pmdm.ut2.exerciseAlerts.app

import com.mrredondo.pmdm.ut2.exerciseAlerts.data.remote.AlertApiModels
import com.mrredondo.pmdm.ut2.exerciseAlerts.domain.FileEntity

class MockApiClient : ApiClient {
    override fun getAlerts(): List<AlertApiModels> =
        mutableListOf(
            AlertApiModels(
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
            AlertApiModels(
                "2",
                "title 02",
                1,
                "summary 02",
                "2021-01-01",
                "body 2",
                "source 02",
                mutableListOf(
                    FileEntity("name 02", "url 02")
                )
            ),
            AlertApiModels(
                "3",
                "title 03",
                1,
                "summary 03",
                "2021-01-01",
                "body 3",
                "source 03",
                mutableListOf(
                    FileEntity("name 03", "url 03")
                )
            )
        )
}