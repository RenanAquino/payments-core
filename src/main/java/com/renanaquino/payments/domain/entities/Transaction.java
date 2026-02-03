package com.renanaquino.payments.domain.entities;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

import com.renanaquino.payments.domain.enums.TransactionType;

public final class Transaction {
    
    private final UUID id;
    private final UUID transferId;
    private final UUID accountId;
    private final BigDecimal amount;
    private final Instant date;
    private final String description;
    private final TransactionType transactionType;

    public Transaction(UUID id, UUID transferId, UUID accountId, BigDecimal amount, Instant date, String description,
            TransactionType transactionType) {
        this.id = id;
        this.transferId = transferId;
        this.accountId = accountId;
        this.amount = amount;
        this.date = date;
        this.description = description;
        this.transactionType = transactionType;
    }

    public UUID getId() {
        return id;
    }

    public UUID getTransferId() {
        return transferId;
    }

    public UUID getAccountId() {
        return accountId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Instant getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }
}
