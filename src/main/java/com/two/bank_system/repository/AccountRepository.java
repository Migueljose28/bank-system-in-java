package com.two.bank_system.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.two.bank_system.domain.Account;

public interface AccountRepository extends JpaRepository<Account, UUID> {
}
