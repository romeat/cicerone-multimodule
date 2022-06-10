package ru.softjet.ciceroneandmultimodule.testfeature2.screens

import com.github.terrakok.cicerone.androidx.FragmentScreen
import ru.softjet.ciceroneandmultimodule.testfeature2.ui.screen1.FragmentFeature2Screen1
import ru.softjet.ciceroneandmultimodule.testfeature2.ui.screen2.FragmentFeature2Screen2

object Feature2Screens {

    fun fragment1() = FragmentScreen {
        FragmentFeature2Screen1.newInstance()
    }

    fun fragment2() = FragmentScreen {
        FragmentFeature2Screen2.newInstance()
    }
}