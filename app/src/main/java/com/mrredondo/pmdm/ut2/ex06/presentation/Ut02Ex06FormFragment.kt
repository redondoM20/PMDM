package com.mrredondo.pmdm.ut2.ex06.presentation

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.gson.Gson
import com.mrredondo.pmdm.commons.serializer.GsonSerializer
import com.mrredondo.pmdm.databinding.Ut02Ex06FormFragmentBinding
import com.mrredondo.pmdm.ut2.ex06.data.PlayerFileLocalSource
import com.mrredondo.pmdm.ut2.ex06.domain.PlayerDataRepository
import com.mrredondo.pmdm.ut2.ex06.domain.SavePlayerUseCase

class Ut02Ex06FormFragment : Fragment() {

    private val viewModel: Ut02Ex06FormViewModel by lazy {
        Ut02Ex06FormViewModel(
            SavePlayerUseCase(
                PlayerDataRepository(
                    PlayerFileLocalSource(
                        Ut02Ex06Activity(),
                        GsonSerializer(Gson())
                    )
                )
            )
        )
    }

    private lateinit var bind: Ut02Ex06FormFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bind = Ut02Ex06FormFragmentBinding.inflate(inflater, container, false)
        setUpView()
        return bind.root
    }

    fun setUpView() {
        bind.saveButton.setOnClickListener {
            savePlayer()
        }
    }

    private fun savePlayer() {
        val name = bind.inputName.text
        val surname = bind.inputSurname.text
        Log.d(TAG, "$name")
        Log.d(TAG, "$surname")
    }

    companion object {
        val TAG: String = Ut02Ex06FormFragment::class.java.name
        fun newInstance() = Ut02Ex06FormFragment()
    }

}