package com.mrredondo.pmdm.ut2.EX02.data

import com.mrredondo.pmdm.ut2.EX02.domain.UserModel
import com.mrredondo.pmdm.ut2.EX02.domain.UserRepository

class UserDataRepository : UserRepository {
    override fun fetchUsers(): List<UserModel> = mutableListOf(
        UserModel(1, "Name01", "Surname01", 1),
        UserModel(2, "Name02", "Surname02", 1),
        UserModel(3, "Name03", "Surname03", 1),
        UserModel(4, "Name04", "Surname04", 1),
        UserModel(5, "Name05", "Surname05", 1),
        UserModel(6, "Name06", "Surname06", 1),
        UserModel(7, "Name07", "Surname07", 1),
        UserModel(8, "Name08", "Surname08", 1),
        UserModel(9, "Name09", "Surname09", 1),
        UserModel(10, "Name10", "Surname10", 1),
        UserModel(11, "Name11", "Surname11", 1),
        UserModel(12, "Name12", "Surname12", 1),
        UserModel(13, "Name13", "Surname13", 1),
        UserModel(14, "Name14", "Surname14", 1),
        UserModel(15, "Name15", "Surname15", 1),
    )
}