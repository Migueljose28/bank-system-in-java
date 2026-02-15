# 📘 Sistema Bancário Simulado (Java - Spring Boot)

---

## 📖 1. Visão Geral

O **Sistema Bancário Simulado** é uma aplicação desenvolvida em Java com o objetivo de simular operações básicas de um banco digital.

O foco principal do projeto é o aprendizado de:

* Programação Orientada a Objetos (POO)
* Arquitetura de software
* Persistência de dados
* Regras de negócio

O sistema permitirá o gerenciamento de contas, clientes e transações, garantindo integridade dos dados e validações de operações.

---

## 🎯 2. Objetivos do Projeto

* Praticar Programação Orientada a Objetos (POO)
* Trabalhar arquitetura em camadas
* Implementar regras de negócio reais
* Simular persistência de dados
* Exercitar versionamento em equipe
* Evoluir para API REST

---

## 🔄 3. Fluxo Básico de Operações

```
Cadastro → criação de conta → operações → registro no histórico → consulta
```

---

## 🛠 4. Tecnologias

* Java 21+
* Maven / Gradle
* Git
* Spring Boot

---

# 📜 Regras de Negócio

* Não é permitido saldo negativo (exceto com limite)
* Transferências exigem saldo suficiente
* Contas bloqueadas não podem operar
* Todas as operações devem gerar histórico
* Valores negativos não são aceitos
* Taxa de transação de R$ 0,70
* Lógica de retry ao realizar pagamento com DLQ

---

# 📋 Escopo e Requisitos

## ✅ Funcionalidades Principais

* Cadastro de cliente
* Criação de conta bancária
* Depósito
* Saque
* Transferência entre contas
* Histórico de transações
* Consulta de extrato
* Validação de conta de destino
* Uso de chave Pix

---

## ⭐ Funcionalidades Extras (Opcional)

* Limite de crédito
* Conta bloqueada
* Taxas bancárias
* Simulação de transações com DLQ e Queue

---

# 🏛 Arquitetura e Design

Arquitetura em camadas:

## Camadas

### 📌 Controller

* Rotas da API REST

### ⚙ Service

* Regras de negócio

### 💾 Repository

* Persistência de dados

### 🧠 Domain

* Entidades principais

---

# 🧱 Modelagem

## Entidades Principais

### 👤 Client

* id
* name
* cpf
* email
* phone
* accounts

---

### 💳 Account
* id
* number
* balance
* status
* client

---

### 💸 Transaction

* id
* type (Enum)
* amount
* date
* originAccount
* destinationAccount

---

## 🚀 Evoluções Futuras

* Autenticação e autorização
* API REST completa
* Filas de processamento
* Monitoramento de transações
* Interface web/mobile

---

**Projeto voltado para aprendizado de arquitetura backend e simulação de regras reais de um sistema bancário.**
