package com.github.arganaphang.wolletz.service

import com.github.arganaphang.wolletz.dto.GetAllTransactionParams
import com.github.arganaphang.wolletz.entity.Transaction
import kotlinx.coroutines.flow.Flow

interface TransactionService {
    fun getAll(params: GetAllTransactionParams): Flow<List<Transaction>>
    suspend fun add(transaction: Transaction)
    suspend fun update(transaction: Transaction)
    suspend fun delete(id: String)
}