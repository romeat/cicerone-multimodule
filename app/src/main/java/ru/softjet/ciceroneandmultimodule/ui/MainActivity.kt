package ru.softjet.ciceroneandmultimodule.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.github.terrakok.cicerone.NavigatorHolder
import com.github.terrakok.cicerone.androidx.AppNavigator
import dagger.hilt.android.AndroidEntryPoint
import ru.softjet.ciceroneandmultimodule.R
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var navigatorHolder: NavigatorHolder

    private val navigator = AppNavigator(this, R.id.container)

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        navigatorHolder.setNavigator(navigator)

        // TODO: без хотя бы одного обращения к вьюмодели не работает
        viewModel.dosometh()
    }

    override fun onPause() {
        super.onPause()
        navigatorHolder.removeNavigator()
    }
}