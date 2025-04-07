package com.github.arganaphang.wolletz.service.impl

import com.github.arganaphang.wolletz.dto.GetAllTransactionParams
import com.github.arganaphang.wolletz.entity.Transaction
import com.github.arganaphang.wolletz.service.TransactionService
import kotlinx.coroutines.flow.Flow

class TransactionServiceImpl : TransactionService {
    override fun getAll(params: GetAllTransactionParams): Flow<List<Transaction>> {
        TODO("Not yet implemented")
    }

    override suspend fun add(transaction: Transaction) {
        TODO("Not yet implemented")
    }

    override suspend fun update(transaction: Transaction) {
        TODO("Not yet implemented")
    }

    override suspend fun delete(id: String) {
        TODO("Not yet implemented")
    }
}