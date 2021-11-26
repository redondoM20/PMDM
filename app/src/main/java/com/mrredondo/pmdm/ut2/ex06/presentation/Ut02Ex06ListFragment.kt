package com.mrredondo.pmdm.ut2.ex06.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.mrredondo.pmdm.R

class Ut02Ex06ListFragment : Fragment() {

    companion object {
        fun newInstance() = Ut02Ex06ListFragment()
    }

    private lateinit var viewModel: Ut02Ex06ListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.ut02_ex06_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(Ut02Ex06ListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}