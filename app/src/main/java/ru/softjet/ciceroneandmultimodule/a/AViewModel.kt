package ru.softjet.ciceroneandmultimodule.a

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import ru.softjet.ciceroneandmultimodule.cicerone.AppRouter
import ru.softjet.ciceroneandmultimodule.cicerone.Screens
import javax.inject.Inject

@HiltViewModel
class AViewModel @Inject constructor(
    val baseRouter: AppRouter
) : ViewModel() {

    fun navToFeature() {
        baseRouter.navigateTo(Screens.featureFragment())
    }
}