package com.mrredondo.pmdm.ut2.ex06.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mrredondo.pmdm.databinding.FragmentUt02Ex06FormBinding

class Ut02Ex06FormFragment : Fragment() {
    private lateinit var bind: FragmentUt02Ex06FormBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bind = FragmentUt02Ex06FormBinding.inflate(inflater, container, false)
        return bind.root
    }

    companion object {
        fun createInstance() = Ut02Ex06FormFragment()
    }
}