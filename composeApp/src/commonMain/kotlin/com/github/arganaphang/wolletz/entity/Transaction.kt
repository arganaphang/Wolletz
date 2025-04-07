package com.github.arganaphang.wolletz.entity

enum class TransactionType {
    IN, OUT
}

data class Transaction(
    val id: String,
    val name: String,
    val category: String,
    val type: TransactionType,
    val amount: Long,
    val createdAt: Long,
)
