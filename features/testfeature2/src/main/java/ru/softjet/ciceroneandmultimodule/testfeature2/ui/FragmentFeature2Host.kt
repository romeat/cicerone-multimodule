package ru.softjet.ciceroneandmultimodule.testfeature2.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.github.terrakok.cicerone.androidx.AppNavigator
import dagger.hilt.android.AndroidEntryPoint
import ru.softjet.ciceroneandmultimodule.testfeature2.R
import ru.softjet.ciceroneandmultimodule.testfeature2.cicerone.FeatureNavigatorWrapper
import ru.softjet.ciceroneandmultimodule.testfeature2.databinding.FragmentFeature2HostBinding
import javax.inject.Inject

@AndroidEntryPoint
class FragmentFeature2Host : Fragment() {

    @Inject
    lateinit var featureNavigatorWrapper: FeatureNavigatorWrapper

    private lateinit var navigator: AppNavigator

    private var _binding: FragmentFeature2HostBinding? = null
    private val binding get() = _binding!!

    private val viewModel: ViewModelFeature2Host by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFeature2HostBinding.inflate(inflater, container, false)
        navigator = AppNavigator(requireActivity(), R.id.feature2Container)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        featureNavigatorWrapper.navHolder.setNavigator(navigator)

        // TODO: нужно, чтобы viewmodel создалась и запустила блок init
        viewModel.dosometh()
    }

    override fun onPause() {
        super.onPause()
        featureNavigatorWrapper.navHolder.removeNavigator()
    }

    companion object {
        fun newInstance(): FragmentFeature2Host {
            return FragmentFeature2Host()
        }
    }
}