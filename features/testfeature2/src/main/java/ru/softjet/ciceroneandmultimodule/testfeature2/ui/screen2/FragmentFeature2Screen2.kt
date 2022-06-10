package ru.softjet.ciceroneandmultimodule.testfeature2.ui.screen2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import ru.softjet.ciceroneandmultimodule.testfeature2.databinding.FragmentFeature2Screen2Binding

@AndroidEntryPoint
class FragmentFeature2Screen2 : Fragment() {

    private var _binding: FragmentFeature2Screen2Binding? = null
    private val binding get() = _binding!!

    private val viewModel: ViewModelScreen2 by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFeature2Screen2Binding.inflate(inflater, container, false)
        binding.backToApp.setOnClickListener { viewModel.backToApp() }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    companion object {
        fun newInstance(): FragmentFeature2Screen2 {
            return FragmentFeature2Screen2()
        }
    }
}