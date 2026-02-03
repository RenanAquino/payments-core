package com.renanaquino.payments.domain.entities;

import java.math.BigDecimal;

public class Account {
    
    private Long id;
    private Long userId;
    private BigDecimal balance;
    
    public Account() {
    }

    public Account(Long id, Long userId) {
        this.id = id;
        this.userId = userId;
        this.balance = new BigDecimal(10000);
    }

    public Long getId() {
        return this.id;
    }

    public Long getUserId() {
        return this.userId;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    public void debit(BigDecimal amount) {
        validateAmount(amount);

        if (this.balance.compareTo(amount) < 0) {
            throw new RuntimeException("Insufficient balance");
        }

        this.balance = balance.subtract(amount);
    }

    public void credit(BigDecimal amount) {

        validateAmount(amount);

        this.balance = balance.add(amount);
    }

    private void validateAmount(BigDecimal amount) {
        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }
    }
}
