package ru.softjet.ciceroneandmultimodule.cicerone

import com.github.terrakok.cicerone.Router
import ru.softjet.ciceroneandmultimodule.common.RootRouter

class AppRouter : Router(), RootRouter {
    override fun backToFragmentA() {
        this.newRootScreen(Screens.fragmentA())
    }
}