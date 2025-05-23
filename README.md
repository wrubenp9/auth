# Spring Security Example

Este é um projeto de exemplo que demonstra como implementar autenticação e autorização utilizando **Spring Security** em uma aplicação Spring Boot.

## 🔧 Tecnologias e Dependências

- **Java 21**
- **Spring Boot 3.4.6**
- **Spring Security**
- **Spring Web**
- **Spring Data JPA**
- **Flyway** (Migração de banco de dados)
- **PostgreSQL** (Banco de dados)
- **Lombok** (Redução de boilerplate)
- **MapStruct** (Mapeamento de objetos)
- **Auth0 JWT** (Geração e validação de tokens JWT)

## 🚀 Funcionalidades

- Autenticação baseada em JWT.
- Autorização com roles (perfis de acesso).
- Configuração de segurança para proteger endpoints.
- Persistência de dados com Spring Data JPA.
- Validação de dados na camada de entrada.
- Controle de versionamento de banco de dados com Flyway.


## 🔐 Autenticação com JWT

Após realizar o login no endpoint `/auth/login`, você receberá um token JWT no corpo da resposta.

### 🧠 Como usar o token?

Para acessar endpoints protegidos, envie o token no **header Authorization** da seguinte forma:

`Authorization: Bearer <seu_token>`

## 🔐 Cadastrar usuário
POST - `/auth/register`

Request:
```
{
    "login": "usuario",
    "password": "senha",
    "role": "USER"
}
```