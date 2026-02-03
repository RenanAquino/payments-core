package com.renanaquino.payments.domain.repositories;

import java.util.Optional;
import java.util.UUID;

import com.renanaquino.payments.domain.entities.Transaction;

public interface TransactionRepository {
    Optional<Transaction> findById(UUID id);
}
