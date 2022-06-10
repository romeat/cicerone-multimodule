package ru.softjet.ciceroneandmultimodule.testfeature2.ui.screen1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import ru.softjet.ciceroneandmultimodule.testfeature2.databinding.FragmentFeature2Screen1Binding

@AndroidEntryPoint
class FragmentFeature2Screen1 : Fragment() {

    private var _binding: FragmentFeature2Screen1Binding? = null
    private val binding get() = _binding!!

    private val viewModel: ViewModelScreen1 by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activity?.onBackPressedDispatcher?.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                viewModel.backToApp()
            }
        })
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFeature2Screen1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.toScreen2.setOnClickListener { viewModel.toScreen2() }
        binding.backToApp.setOnClickListener { viewModel.backToApp() }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        fun newInstance(): FragmentFeature2Screen1 {
            return FragmentFeature2Screen1()
        }
    }
}