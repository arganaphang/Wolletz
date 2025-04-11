package com.github.arganaphang.wolletz.entity

import kotlinx.datetime.Instant

enum class TransactionType {
    IN, OUT
}

data class Transaction(
    val id: String,
    val name: String,
    val category: String,
    val type: TransactionType,
    val amount: Number,
    val createdAt: Instant,
)
