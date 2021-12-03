package com.mrredondo.pmdm.ut2.ex06.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson
import com.mrredondo.pmdm.commons.serializer.GsonSerializer
import com.mrredondo.pmdm.databinding.Ut02Ex06ListFragmentBinding
import com.mrredondo.pmdm.ut2.ex06.data.PlayerDataRepository
import com.mrredondo.pmdm.ut2.ex06.data.PlayerFileLocalSource
import com.mrredondo.pmdm.ut2.ex06.domain.GetPlayersUseCase

class Ut02Ex06ListFragment : Fragment() {

    private val viewModel: Ut02Ex06ListViewModel by lazy {
        Ut02Ex06ListViewModel(
            GetPlayersUseCase(
                PlayerDataRepository(
                    PlayerFileLocalSource(
                        requireActivity(), GsonSerializer(Gson())
                    )
                )
            )
        )
    }

    private val playerAdapter = PlayerAdapter()

    private lateinit var bind: Ut02Ex06ListFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bind = Ut02Ex06ListFragmentBinding.inflate(inflater, container, false)
        setupView()
        return bind.root
    }

    private fun setupView() {
        bind.listPlayers.adapter = playerAdapter
        bind.listPlayers.layoutManager =
            LinearLayoutManager(requireActivity(), LinearLayoutManager.VERTICAL, false)
    }

    companion object {
        val TAG: String = Ut02Ex06ListFragment::class.java.name
        fun newInstance() = Ut02Ex06ListFragment()
    }
}