package com.github.arganaphang.wolletz.repository.impl

import com.github.arganaphang.wolletz.dto.GetAllTransactionParams
import com.github.arganaphang.wolletz.entity.Transaction
import com.github.arganaphang.wolletz.repository.TransactionRepository
import kotlinx.coroutines.flow.Flow

class TransactionRepositoryImpl : TransactionRepository {
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