package ru.softjet.ciceroneandmultimodule.a

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import ru.softjet.ciceroneandmultimodule.databinding.FragmentABinding

@AndroidEntryPoint
class AFragment : Fragment() {

    //private val binding by viewBinding(FragmentABinding::bind)

    private var _binding: FragmentABinding? = null
    private val binding get() = _binding!!

    private val viewModel: AViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentABinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.toFeature.setOnClickListener { viewModel.navToFeature() }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        fun newInstance(): AFragment {
            return AFragment()
        }
    }
}