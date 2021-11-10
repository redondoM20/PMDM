package com.mrredondo.pmdm.ut2.EX02.domain

class GetUserUseCase(private val repository: UserRepository) {
    fun execute(): List<UserModel> = repository.fetchUsers()
}