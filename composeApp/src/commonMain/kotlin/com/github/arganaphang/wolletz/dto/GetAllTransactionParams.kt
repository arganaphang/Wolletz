package com.github.arganaphang.wolletz.dto

import com.github.arganaphang.wolletz.entity.TransactionType

data class GetAllTransactionParams(
    val q: String,
    val type: TransactionType,
    val startDate: Long,
    val endDate: Long,
)
