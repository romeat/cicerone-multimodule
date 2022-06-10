package ru.softjet.ciceroneandmultimodule.testfeature2.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import ru.softjet.ciceroneandmultimodule.testfeature2.cicerone.Feature2Router
import ru.softjet.ciceroneandmultimodule.testfeature2.screens.Feature2Screens
import javax.inject.Inject

@HiltViewModel
class ViewModelFeature2Host @Inject constructor(
    val router: Feature2Router
) : ViewModel() {

    init {
        router.navigateTo(Feature2Screens.fragment1())
    }

    fun dosometh() {
        Log.d("TAG", "dosometh: ViewModelFeature2Host")
    }
}