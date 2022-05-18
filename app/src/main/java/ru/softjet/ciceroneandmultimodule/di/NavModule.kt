package ru.softjet.ciceroneandmultimodule.di

import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.NavigatorHolder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.softjet.ciceroneandmultimodule.cicerone.AppRouter
import ru.softjet.ciceroneandmultimodule.common.RootRouter
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class NavModule {

    val router = AppRouter()
    private val navigator: Cicerone<AppRouter> = Cicerone.create(router)

    @Provides
    @Singleton
    fun provideRouter(): AppRouter = navigator.router

    @Provides
    @Singleton
    fun provideCrossFeatureRouter(): RootRouter = navigator.router

    @Provides
    @Singleton
    fun provideNavigatorHolder(): NavigatorHolder = navigator.getNavigatorHolder()

}