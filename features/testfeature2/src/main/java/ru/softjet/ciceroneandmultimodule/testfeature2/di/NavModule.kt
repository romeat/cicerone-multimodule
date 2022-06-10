package ru.softjet.ciceroneandmultimodule.testfeature2.di

import com.github.terrakok.cicerone.Cicerone
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.softjet.ciceroneandmultimodule.testfeature2.cicerone.Feature2Router
import ru.softjet.ciceroneandmultimodule.testfeature2.cicerone.FeatureNavigatorWrapper
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class NavModule {

    private val router = Feature2Router()
    private val navigator: Cicerone<Feature2Router> = Cicerone.create(router)

    @Provides
    @Singleton
    fun provideRouter(): Feature2Router = navigator.router

    @Provides
    @Singleton
    fun provideNavigatorHolder(): FeatureNavigatorWrapper = FeatureNavigatorWrapper(navigator.getNavigatorHolder())
}