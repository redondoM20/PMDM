package com.mrredondo.pmdm.ut2.ex06.presentation

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
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
        replaceFragment(bind.containerFragment.id, Ut02Ex06FormFragment.createInstance())
    }

    private fun setupCustomToolbar() {
        bind.mainBar.visibility = View.GONE
        bind.viewCustomToolbar.customToolbar.visibility = View.VISIBLE

        bind.viewCustomToolbar.title.text = getString(R.string.title_form)
        bind.viewCustomToolbar.customToolbar.inflateMenu(R.menu.menu_ut02_ex06)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_ut02_ex06, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_change -> {
                Log.d("@dev", "SI")
                true

                /*if (bind.viewCustomToolbar.title.text == getString(R.string.title_form)){
                    bind.viewCustomToolbar.title.text = getString(R.string.title_list)
                    replaceFragment(bind.containerFragment.id, Ut02Ex06FormFragment.createInstance())
                }else{
                    bind.viewCustomToolbar.title.text = getString(R.string.title_form)
                }
                true*/
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