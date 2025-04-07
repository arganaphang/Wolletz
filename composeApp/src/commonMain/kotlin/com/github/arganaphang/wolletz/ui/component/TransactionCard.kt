package com.github.arganaphang.wolletz.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.github.arganaphang.wolletz.entity.Transaction
import com.github.arganaphang.wolletz.entity.TransactionType
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun TransactionCard(
    transaction: Transaction
) {
    Column {
        Text(transaction.name)
    }
}

@Preview
@Composable
fun TransactionCard_Preview() {
    TransactionCard(Transaction(
        id = "1",
        name = "First Transaction",
        category = "Food",
        type = TransactionType.OUT,
        amount = 10_000,
        createdAt = 0
    ))
}