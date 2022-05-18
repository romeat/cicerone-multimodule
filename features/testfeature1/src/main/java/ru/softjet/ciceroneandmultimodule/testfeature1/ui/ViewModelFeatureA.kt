package ru.softjet.ciceroneandmultimodule.testfeature1.ui

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import ru.softjet.ciceroneandmultimodule.common.RootRouter
import javax.inject.Inject

@HiltViewModel
class ViewModelFeatureA @Inject constructor(
    private val appRouter: RootRouter
) : ViewModel() {

    fun backToApp() {
        appRouter.backToFragmentA()
    }
}