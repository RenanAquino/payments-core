package com.renanaquino.payments.domain.entities;

import java.math.BigDecimal;
import java.time.Instant;

import com.renanaquino.payments.domain.enums.TransactionType;

public final class Transaction {
    
    private final Long id;
    private final Long transferId;
    private final Long accountId;
    private final BigDecimal amount;
    private final Instant date;
    private final String description;
    private final TransactionType transactionType;

    public Transaction(Long id, Long transferId, Long accountId, BigDecimal amount, Instant date, String description,
            TransactionType transactionType) {
        this.id = id;
        this.transferId = transferId;
        this.accountId = accountId;
        this.amount = amount;
        this.date = date;
        this.description = description;
        this.transactionType = transactionType;
    }

    public Long getId() {
        return id;
    }

    public Long getTransferId() {
        return transferId;
    }

    public Long getAccountId() {
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
