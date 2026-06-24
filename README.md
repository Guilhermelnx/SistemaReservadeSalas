# 🏫 Sisreserva - Sistema de Reserva de Salas (API)

![Java](https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring-boot)
![H2 Database](https://img.shields.io/badge/H2_Database-blue?style=for-the-badge)

## 📌 Sobre o Projeto
O **Sisreserva** é uma API REST desenvolvida como projeto acadêmico para o curso de Engenharia de Software da UNIFAN. O objetivo do sistema é gerenciar o agendamento de espaços acadêmicos (como laboratórios e auditórios), garantindo a integridade dos dados e evitando conflitos de horários.

Este repositório contém o **Back-end** da aplicação. O Front-end foi desenvolvido separadamente em uma arquitetura desacoplada.

## 🚀 Funcionalidades e Regras de Negócio
- **Gestão de Espaços:** Cadastro de ambientes com validação para impedir nomes duplicados no banco de dados.
- **Gestão de Usuários:** Cadastro de alunos e professores.
- **Motor de Reservas:**
  - Criação de reservas vinculando o `Usuário` ao `Espaço`.
  - 🛡️ **Prevenção de Choque de Horários:** Uma *Query* customizada impede que o mesmo espaço seja reservado no mesmo período por usuários diferentes.
  - **Cancelamento Lógico:** Reservas não são deletadas do banco, mas têm seu status alterado para `CANCELADA`, liberando o espaço automaticamente para novos agendamentos.
- **Integração:** Configuração global de **CORS** implementada para permitir o consumo da API por aplicações Front-end externas (React/Vue/JS puro).

## 🛠️ Tecnologias Utilizadas
- **Linguagem:** Java 17
- **Framework:** Spring Boot
- **Banco de Dados:** H2 Database (Em memória)
- **Gerenciador de Dependências:** Maven
- **Testes de API:** Postman / cURL (PowerShell)

## ⚙️ Como executar o projeto localmente

1. **Clone este repositório:**
```bash
   git clone [https://github.com/Guilhermelnx/SistemaReservadeSalas.git](https://github.com/Guilhermelnx/SistemaReservadeSalas.git)
