package com.renanaquino.payments.domain.entities;

import java.util.UUID;

public class User {
    
    private UUID id;
    private String fullName;
    private String email;
    private String password;
    private boolean isActive;
    private boolean isVerified;

    public User() {
    }

    public User(UUID id, String fullName, String email, String password) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.isActive = true;
        this.isVerified = false;
    }

    public UUID getId() {
        return this.id;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public boolean isActive() {
        return this.isActive;
    }

    public boolean isVerified() {
        return this.isVerified;
    }

    public void changePassword(String newPassword) {
        if (!this.isActive) {
            throw new RuntimeException("Password can't be changed when account is not active");
        }
        this.password = newPassword;
    }

    public void verify() {
        if (!this.isActive) {
            throw new RuntimeException("Inactive user cannot be verified");
        }
        if (this.isVerified) {
            throw new RuntimeException("User is already verified");
        }

        this.isVerified = true;
    }

    public void deactivate() {
        this.isActive = false;
    }

    public void activate() {
        this.isActive = true;
    }
}
