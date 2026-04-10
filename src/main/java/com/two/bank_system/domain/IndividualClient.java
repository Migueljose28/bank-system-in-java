package com.two.bank_system.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class IndividualClient extends Client {

  private String name;
  private String cpf;
  private LocalDate birthDate;
}
