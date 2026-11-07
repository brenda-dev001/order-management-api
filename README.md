# ☕ Order Management API

Projeto desenvolvido durante meus estudos de Java, acompanhando um curso da Udemy, com foco no desenvolvimento de APIs REST utilizando Spring Boot, JPA/Hibernate e integração com bancos de dados relacionais.

## ✨ Funcionalidades

- Listagem e busca de usuários por ID.
- Cadastro, atualização e exclusão de usuários.
- Listagem e busca de pedidos, produtos e categorias.
- Relacionamentos entre entidades utilizando JPA/Hibernate.
- Associação de produtos a categorias e pedidos.
- Tratamento personalizado de exceções e erros HTTP.
- Persistência de dados utilizando Spring Data JPA.
- Integração com bancos de dados H2 e PostgreSQL.

## 🛠️ Tecnologias utilizadas

<p align="center">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original.svg" width="40" height="40" alt="Java" title="Java" />
  &nbsp;
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/spring/spring-original.svg" width="40" height="40" alt="Spring Boot" title="Spring Boot" />
  &nbsp;
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/hibernate/hibernate-original.svg" width="40" height="40" alt="Hibernate" title="Hibernate" />
  &nbsp;
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/postgresql/postgresql-original.svg" width="40" height="40" alt="PostgreSQL" title="PostgreSQL" />
  &nbsp;
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/maven/maven-original.svg" width="40" height="40" alt="Maven" title="Maven" />
  &nbsp;
</p>

## ⚙️ Como o projeto funciona

O projeto consiste em uma API REST desenvolvida com Spring Boot, utilizando Spring Data JPA e Hibernate para realizar operações em bancos de dados relacionais.

A aplicação segue uma arquitetura em camadas, separando as responsabilidades entre **Controller**, **Service** e **Repository**.

O sistema possui as entidades `User`, `Order`, `Product`, `Category`, `OrderItem` e `Payment`, relacionadas entre si por meio de associações JPA.

As operações são disponibilizadas através de endpoints HTTP, permitindo consultas e gerenciamento de usuários, além da visualização de pedidos, produtos e categorias.

## 📁 Estrutura do projeto

```text
order-management-api/
├── src/
│   ├── main/
│   │   ├── java/com/project/ordermanagement/
│   │   │   ├── config/
│   │   │   ├── controllers/
│   │   │   │   └── exceptions/
│   │   │   ├── entities/
│   │   │   │   ├── enums/
│   │   │   │   └── pk/
│   │   │   ├── repositories/
│   │   │   ├── services/
│   │   │   │   └── exceptions/
│   │   │   └── OrderManagementApplication.java
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── application-dev.properties
│   │       └── application-test.properties
│   └── test/
├── pom.xml
├── mvnw
└── .gitignore
```

## 🚀 Executando o projeto

1. Tenha o Java 25 ou superior instalado.
2. Clone o repositório e abra o projeto em uma IDE compatível com Java, como IntelliJ IDEA.
3. Configure o perfil desejado:
   - `test`: utiliza o banco H2 em memória.
   - `dev`: utiliza o PostgreSQL.
4. Para utilizar o PostgreSQL, configure as variáveis de ambiente `DB_URL`, `DB_USERNAME` e `DB_PASSWORD`.
5. Execute a classe `OrderManagementApplication.java` ou utilize o Maven.
6. Utilize o Postman para testar os endpoints da API.

Para executar com o perfil de teste:

```bash
./mvnw spring-boot:run -Dspring-boot.run.profiles=test
```

A aplicação estará disponível em `http://localhost:8080`.

## 📌 Status do projeto

Projeto desenvolvido para fins de estudo e prática dos conceitos de Java, Spring Boot, APIs REST, JPA/Hibernate, persistência de dados, relacionamentos entre entidades e tratamento de exceções.

## 👩‍💻 Autoria

Desenvolvido por [Brenda](https://github.com/brenda-dev001), acompanhando um curso de Java da Udemy.