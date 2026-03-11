package com.two.bank_system.domain;

import com.two.bank_system.AccountStatus;

import java.math.BigDecimal;
import java.lang.Integer;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Account {

    @Id
    private UUID id;

    private Integer number;

    private BigDecimal balance;

    private AccountStatus status;

}
