package ru.softjet.ciceroneandmultimodule.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import ru.softjet.ciceroneandmultimodule.cicerone.AppRouter
import ru.softjet.ciceroneandmultimodule.cicerone.Screens
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    val baseRouter: AppRouter
) : ViewModel() {

    init {
        baseRouter.newRootScreen(Screens.fragmentA())
    }

    fun dosometh() {
        Log.d("TAG", "dosometh: as")
    }
}