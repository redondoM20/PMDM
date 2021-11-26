package com.mrredondo.pmdm.ut2.ex06.presentation

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.mrredondo.pmdm.R
import com.mrredondo.pmdm.databinding.ActivityUt02Ex06Binding

class Ut02Ex06Activity : AppCompatActivity() {

    private val bind: ActivityUt02Ex06Binding by lazy {
        ActivityUt02Ex06Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupView()
    }

    private fun setupView() {
        setupViewBinding()
        setupCustomToolbar()
    }

    private fun setupViewBinding() {
        setContentView(bind.root)
        replaceFragment(bind.containerFragment.id, Ut02Ex06FormFragment.newInstance())
    }

    private fun setupCustomToolbar() {
        setSupportActionBar(bind.mainBar)
        supportActionBar?.title = getString(R.string.title_form)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_ut02_ex06, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_change -> {

                if (supportActionBar?.title == getString(R.string.title_form)) {
                    replaceFragment(bind.containerFragment.id, Ut02Ex06ListFragment.newInstance())
                    supportActionBar?.title = getString(R.string.title_list)
                } else {
                    replaceFragment(bind.containerFragment.id, Ut02Ex06FormFragment.newInstance())
                    supportActionBar?.title = getString(R.string.title_form)
                }
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }


    private fun replaceFragment(layoutId: Int, fragment: Fragment) {
        val fragmentTransition = supportFragmentManager.beginTransaction()
        fragmentTransition.replace(layoutId, fragment)
        fragmentTransition.addToBackStack(null)
        fragmentTransition.commit()
    }


}