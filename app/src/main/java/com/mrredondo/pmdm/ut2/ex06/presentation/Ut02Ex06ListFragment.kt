package com.mrredondo.pmdm.ut2.ex06.presentation

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.google.gson.Gson
import com.mrredondo.pmdm.commons.serializer.GsonSerializer
import com.mrredondo.pmdm.databinding.Ut02Ex06ListFragmentBinding
import com.mrredondo.pmdm.ut2.ex06.data.PlayerFileLocalSource
import com.mrredondo.pmdm.ut2.ex06.domain.GetPlayersUseCase
import com.mrredondo.pmdm.ut2.ex06.domain.PlayerDataRepository

class Ut02Ex06ListFragment : Fragment() {

    private val viewModel: Ut02Ex06ListViewModel by lazy {
        Ut02Ex06ListViewModel(
            GetPlayersUseCase(
                PlayerDataRepository(
                    PlayerFileLocalSource(
                        Ut02Ex06Activity(), GsonSerializer(Gson())
                    )
                )
            )
        )
    }

    private lateinit var bind: Ut02Ex06ListFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bind = Ut02Ex06ListFragmentBinding.inflate(inflater, container, false)
        setupObservables()
        loadPlayers()
        return bind.root
    }

    private fun setupObservables() {
        val playerObserver = Observer<PlayerViewState> { playerViewState ->
            renderPlayers(playerViewState)
        }
        viewModel.playerObservable.observe(this, playerObserver)
    }

    private fun renderPlayers(playerViewState: PlayerViewState) {
        playerViewState.data.forEach { playerModel ->
            Log.d(TAG, "$playerModel")
        }
    }

    private fun loadPlayers() {
        viewModel.getPlayers()
    }

    companion object {
        val TAG: String = Ut02Ex06ListFragment::class.java.name
        fun newInstance() = Ut02Ex06ListFragment()
    }
}