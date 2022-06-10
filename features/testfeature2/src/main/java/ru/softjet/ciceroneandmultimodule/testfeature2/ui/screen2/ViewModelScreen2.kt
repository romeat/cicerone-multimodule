package ru.softjet.ciceroneandmultimodule.testfeature2.ui.screen2

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import ru.softjet.ciceroneandmultimodule.common.RootRouter
import ru.softjet.ciceroneandmultimodule.testfeature2.cicerone.Feature2Router
import javax.inject.Inject

@HiltViewModel
class ViewModelScreen2 @Inject constructor(
    val rootRouter: RootRouter
) : ViewModel() {

    fun backToApp() {
        rootRouter.backToFragmentA()
    }
}