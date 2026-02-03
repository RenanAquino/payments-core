package com.renanaquino.payments.domain.repositories;

import java.util.Optional;
import java.util.UUID;

import com.renanaquino.payments.domain.entities.Account;

public interface AccountRepository {
    Optional<Account> findById(UUID id);
}
