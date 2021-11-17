package com.mrredondo.pmdm.ut2.EX02.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.mrredondo.pmdm.R
import com.mrredondo.pmdm.databinding.ActivityUt02Ex02Binding
import com.mrredondo.pmdm.ut2.EX02.data.UserDataRepository
import com.mrredondo.pmdm.ut2.EX02.domain.GetUserUseCase

class Ut02Ex02Activity : AppCompatActivity() {

    private val viewModel = Ut02Ex02ViewModel(GetUserUseCase(UserDataRepository()))
    private val userAdapter = UserAdapter()

    private val bind: ActivityUt02Ex02Binding by lazy {
        ActivityUt02Ex02Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(bind.root)
        setupView()
        //exampleInflateView()
        exampleRecycledView()
    }

    private fun setupView() {
        bind.listUsers.adapter = userAdapter
        bind.listUsers.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }

    private fun exampleInflateView() {
        val view = layoutInflater.inflate(R.layout.view_item_ut02_ex02, bind.root, false)
        bind.wrapContent.addView(view)
    }

    private fun exampleRecycledView() {
        val users = viewModel.getUsers()
        userAdapter.setItems(users)
    }
}