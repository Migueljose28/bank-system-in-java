package com.two.bank_system.domain;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class BusinessClient extends Client {

  private String companyName;
  private String cnpj;
}
