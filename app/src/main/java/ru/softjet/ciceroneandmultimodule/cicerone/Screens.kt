package ru.softjet.ciceroneandmultimodule.cicerone

import com.github.terrakok.cicerone.androidx.FragmentScreen
import ru.softjet.ciceroneandmultimodule.a.AFragment
import ru.softjet.ciceroneandmultimodule.testfeature1.ui.FragmentFeatureA

object Screens {

    fun fragmentA() = FragmentScreen {
        AFragment.newInstance()
    }

    fun featureFragment() = FragmentScreen {
        FragmentFeatureA.newInstance()
    }
}