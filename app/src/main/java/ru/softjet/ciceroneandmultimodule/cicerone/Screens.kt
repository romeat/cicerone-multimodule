package ru.softjet.ciceroneandmultimodule.cicerone

import com.github.terrakok.cicerone.androidx.FragmentScreen
import ru.softjet.ciceroneandmultimodule.a.AFragment
import ru.softjet.ciceroneandmultimodule.testfeature1.ui.FragmentFeatureA
import ru.softjet.ciceroneandmultimodule.testfeature2.ui.FragmentFeature2Host

object Screens {

    fun fragmentA() = FragmentScreen {
        AFragment.newInstance()
    }

    fun featureFragment() = FragmentScreen {
        FragmentFeatureA.newInstance()
    }

    fun feature2Fragment() = FragmentScreen {
        FragmentFeature2Host.newInstance()
    }
}