package com.mrredondo.pmdm.ut2.ex06.domain

data class PlayerModel(
    val name: String,
    val surname: String,
    val ccaa: String,
    val sexo: String,
    val position: List<String>
)