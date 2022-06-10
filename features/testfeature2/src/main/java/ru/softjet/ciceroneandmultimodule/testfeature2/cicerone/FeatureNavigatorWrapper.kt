package ru.softjet.ciceroneandmultimodule.testfeature2.cicerone

import com.github.terrakok.cicerone.NavigatorHolder

// класс-обертка создан чисто для того, чтобы обойти кофликт при инжекте
// NavigatorHolder-а, так как в app-модуле и в feature-модуле
// должны использоваться разные NavigationHolder-ы
class FeatureNavigatorWrapper constructor(val navHolder: NavigatorHolder) {
}