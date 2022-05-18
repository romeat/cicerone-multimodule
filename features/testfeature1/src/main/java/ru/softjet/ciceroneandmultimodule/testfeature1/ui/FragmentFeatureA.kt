package ru.softjet.ciceroneandmultimodule.testfeature1.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import ru.softjet.ciceroneandmultimodule.testfeature1.databinding.FragmentFeatureABinding

@AndroidEntryPoint
class FragmentFeatureA : Fragment()  {

    private var _binding: FragmentFeatureABinding? = null
    private val binding get() = _binding!!

    private val viewModel: ViewModelFeatureA by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFeatureABinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.backToApp.setOnClickListener { viewModel.backToApp() }
    }

    companion object {
        fun newInstance(): FragmentFeatureA {
            return FragmentFeatureA()
        }
    }
}