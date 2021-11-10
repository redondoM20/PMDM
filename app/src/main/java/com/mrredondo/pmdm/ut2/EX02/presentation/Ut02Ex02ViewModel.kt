package com.mrredondo.pmdm.ut2.EX02.presentation

import androidx.lifecycle.ViewModel
import com.mrredondo.pmdm.ut2.EX02.domain.GetUserUseCase

class Ut02Ex02ViewModel(private val useCase: GetUserUseCase) : ViewModel() {
    fun getUsers(): List<UserViewState> {
        val users = useCase.execute()
        return users.map { userModel ->
            UserViewState(
                userModel.id, "${userModel.name} ${userModel.surname}",
                userModel.age.toString()
            )
        }
    }
}