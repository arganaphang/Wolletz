package com.github.arganaphang.wolletz.ui.preview

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.github.arganaphang.wolletz.entity.Transaction
import com.github.arganaphang.wolletz.entity.TransactionType
import com.github.arganaphang.wolletz.ui.component.TransactionCard
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toInstant


@Preview
@Composable
fun TransactionCardPreview() {
    TransactionCard(
        Transaction(
            id = "1",
            name = "First Transaction",
            category = "Food",
            type = TransactionType.OUT,
            amount = 10_000,
            createdAt = LocalDateTime(2016, 2, 15, 16, 57, 0, 0).toInstant(TimeZone.UTC)
        ),
    )
}