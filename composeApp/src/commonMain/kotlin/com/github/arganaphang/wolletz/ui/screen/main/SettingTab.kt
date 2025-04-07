package com.github.arganaphang.wolletz.ui.screen.main


import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import cafe.adriel.voyager.transitions.FadeTransition
import com.github.arganaphang.wolletz.ui.screen.setting.SettingScreen

object SettingTab : Tab {
    @Composable
    override fun Content() {
        Navigator(SettingScreen()) { navigator ->
            FadeTransition(navigator)
        }
    }

    override val options: TabOptions
        @Composable get() {
            val icon = rememberVectorPainter(Icons.Rounded.Settings)
            return remember {
                TabOptions(
                    index = 2u,
                    title = "Setting",
                    icon = icon,
                )
            }
        }
}