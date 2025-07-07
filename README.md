# lab-spring-api-rest

Este projeto é uma API REST desenvolvida com Spring Boot que permite o cadastro de **clientes** com **endereços obtidos automaticamente via CEP**, utilizando a API pública do ViaCEP. Os dados são persistidos em um banco de dados H2 em memória.

## Funcionalidades

- Cadastro de clientes via JSON
- Consulta de endereço automática através do CEP (integração com ViaCEP)
- Listagem de clientes cadastrados
- Persistência em banco de dados H2
- Estrutura RESTful com boas práticas

## Tecnologias e Ferramentas Utilizadas

- Java 21
- Swagger
- Spring Boot
- Spring Data JPA
- H2 Database (em memória)
- Feign Client (consumo da API ViaCEP)
- Maven
- Padrões de projeto aplicados:
  - Singleton
  - Facade
  - Strategy
