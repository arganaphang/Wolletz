package com.github.arganaphang.wolletz.ui.screen.main

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import cafe.adriel.voyager.navigator.tab.CurrentTab
import cafe.adriel.voyager.navigator.tab.LocalTabNavigator
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabNavigator
import com.github.arganaphang.wolletz.ui.screen.addtransaction.AddTransactionScreen

class MainScreen : Screen {
    @Composable
    override fun Content() {
        TabNavigator(HomeTab) {
            val navigator = LocalNavigator.currentOrThrow
            Scaffold(
                floatingActionButton = {
                    AnimatedVisibility(
                        it.current.options.index.toUInt() == 0u,
                        enter = scaleIn(),
                        exit = scaleOut(),
                    ) {
                        FloatingActionButton(
                            onClick = {
                                navigator.parent?.push(AddTransactionScreen())
                            },
                        ) {
                            Icon(Icons.Rounded.Add, "Floating action button.")
                        }
                    }
                },
                bottomBar = {
                    NavigationBar {
                        TabNavigationItem(HomeTab)
                        TabNavigationItem(DashboardTab)
                        TabNavigationItem(SettingTab)
                    }
                },
            ) {
                CurrentTab()
            }
        }

    }
}


@Composable
private fun RowScope.TabNavigationItem(tab: Tab) {
    val tabNavigator = LocalTabNavigator.current
    NavigationBarItem(
        selected = tabNavigator.current == tab,
        onClick = { tabNavigator.current = tab },
        label = { Text(tab.options.title) },
        icon = { Icon(painter = tab.options.icon!!, contentDescription = tab.options.title) },
    )
}