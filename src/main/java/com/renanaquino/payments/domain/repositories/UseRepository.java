package com.renanaquino.payments.domain.repositories;

import java.util.Optional;
import java.util.UUID;

import com.renanaquino.payments.domain.entities.User;

public interface UseRepository {
    User save(User user);
    Optional<User> findByEmail(String email);
    Optional<User> findById(UUID id);
}
