package com.mrredondo.pmdm.ut2.EX02.domain

interface UserRepository {
    fun fetchUsers(): List<UserModel>
}