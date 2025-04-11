package com.github.arganaphang.wolletz.ui.screen.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import com.github.arganaphang.wolletz.entity.Transaction
import com.github.arganaphang.wolletz.entity.TransactionType
import com.github.arganaphang.wolletz.ui.component.TransactionCard
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toInstant

class HomeScreen : Screen {
    @Composable
    override fun Content() {
        Column(
            modifier = Modifier.fillMaxSize().padding(horizontal = 24.dp, vertical = 24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(100) { index ->
                    TransactionCard(
                        transaction = Transaction(
                            index.toString(),
                            name = "Transaction ${index + 1}",
                            category = "Food",
                            type = if (index % 2 == 0) TransactionType.IN else TransactionType.OUT,
                            amount = (index + 1) * 1000,
                            createdAt = LocalDateTime(
                                2016, 2, 15, 16, 57, 0, 0
                            ).toInstant(TimeZone.UTC)
                        )
                    )

                }
            }
        }
    }
}