package ru.softjet.ciceroneandmultimodule.testfeature2.ui.screen1

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import ru.softjet.ciceroneandmultimodule.common.RootRouter
import ru.softjet.ciceroneandmultimodule.testfeature2.cicerone.Feature2Router
import ru.softjet.ciceroneandmultimodule.testfeature2.screens.Feature2Screens
import javax.inject.Inject

@HiltViewModel
class ViewModelScreen1 @Inject constructor(
    val router: Feature2Router,
    val rootRouter: RootRouter
) : ViewModel() {

    fun toScreen2() {
        router.navigateTo(Feature2Screens.fragment2())
    }

    fun backToApp() {
        rootRouter.backToFragmentA()
    }
}