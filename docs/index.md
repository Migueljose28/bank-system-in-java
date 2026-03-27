# 📜 Regras de Negócio

* Não é permitido saldo negativo
* Transferências exigem saldo suficiente
* Contas bloqueadas não podem operar
* Todas as operações devem gerar histórico
* Valores negativos não são aceitos
* Taxa de transação de R$ 0,80
* Cliente tem que ter 18 anos ou mais

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


# 🏛 Arquitetura e Design

Arquitetura em camadas:

## Camadas

### Controller

* Rotas da API REST

### Service

* Regras de negócio

### Repository

* Persistência de dados

### Domain

* Entidades principais

### DTO (Data Transfer Object)
* Model de dados que serão recebido e retornado (ajuda para validação)

---

