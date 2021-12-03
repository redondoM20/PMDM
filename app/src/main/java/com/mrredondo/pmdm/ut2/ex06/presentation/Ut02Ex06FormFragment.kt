package com.mrredondo.pmdm.ut2.ex06.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatRadioButton
import androidx.fragment.app.Fragment
import com.google.gson.Gson
import com.mrredondo.pmdm.commons.serializer.GsonSerializer
import com.mrredondo.pmdm.databinding.Ut02Ex06FormFragmentBinding
import com.mrredondo.pmdm.ut2.ex06.data.PlayerDataRepository
import com.mrredondo.pmdm.ut2.ex06.data.PlayerFileLocalSource
import com.mrredondo.pmdm.ut2.ex06.domain.PlayerModel
import com.mrredondo.pmdm.ut2.ex06.domain.SavePlayerUseCase

class Ut02Ex06FormFragment : Fragment() {

    private val viewModel: Ut02Ex06FormViewModel by lazy {
        Ut02Ex06FormViewModel(
            SavePlayerUseCase(
                PlayerDataRepository(
                    PlayerFileLocalSource(
                        requireActivity(), GsonSerializer(Gson())
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
        val ccaa = bind.inputCcaa.selectedItem
        val checked = bind.inputGender.checkedRadioButtonId
        val gender = bind.inputGender.findViewById<AppCompatRadioButton>(checked).text
        val portero = bind.portero
        val defensa = bind.defensa
        val mediocentro = bind.mediocentro
        val delantero = bind.delantero
        val positions = mutableListOf<String>()
        if (portero.isChecked) {
            positions += portero.text.toString()
        }
        if (defensa.isChecked) {
            positions += defensa.text.toString()
        }
        if (mediocentro.isChecked) {
            positions += mediocentro.text.toString()
        }
        if (delantero.isChecked) {
            positions += delantero.text.toString()
        }
        viewModel.savePlayer(PlayerModel("$name", "$surname", "$ccaa", "$gender", positions))
        clearFragment()
    }

    private fun clearFragment() {
        bind.inputName.setText(" ")
        bind.inputSurname.setText(" ")
        bind.inputCcaa.setSelection(0)
        bind.radioMujer.isChecked = true
        bind.radioHombre.isChecked = false
        bind.portero.isChecked = false
        bind.defensa.isChecked = false
        bind.mediocentro.isChecked = false
        bind.delantero.isChecked = false
    }

    companion object {
        val TAG: String = Ut02Ex06FormFragment::class.java.name
        fun newInstance() = Ut02Ex06FormFragment()
    }

}