package com.github.arganaphang.wolletz

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.SlideTransition
import com.github.arganaphang.wolletz.ui.screen.main.MainScreen
import com.github.arganaphang.wolletz.ui.theme.AppTheme

@Composable
fun App() {
    AppTheme {
        Navigator(MainScreen()) { navigator ->
            SlideTransition(navigator)
        }
    }
}
