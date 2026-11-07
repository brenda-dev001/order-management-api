# ☕ Order Management API

**English** | [Português](README.pt-BR.md)

Project developed during my Java studies, following a Udemy course, focusing on REST API development using Spring Boot, JPA/Hibernate, and relational databases.

## ✨ Features

- List and retrieve users by ID.
- Create, update, and delete users.
- List and retrieve orders, products, and categories.
- Entity relationship mapping using JPA/Hibernate.
- Associations between products, categories, and orders.
- Custom exception handling and HTTP error responses.
- Data persistence using Spring Data JPA.
- Integration with H2 and PostgreSQL databases.

## 🛠️ Technologies Used

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
</p>

## ⚙️ How It Works

The project consists of a REST API developed with Spring Boot, using Spring Data JPA and Hibernate to perform operations on relational databases.

The application follows a layered architecture, separating responsibilities into **Controller**, **Service**, and **Repository**.

The main entities are `User`, `Order`, `Product`, `Category`, `OrderItem`, and `Payment`, connected through JPA relationships.

The API provides HTTP endpoints for managing users and retrieving orders, products, and categories.

## 📁 Project Structure

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

## 🚀 Running the Project

1. Install Java 25 or later.
2. Clone the repository and open it in a Java-compatible IDE, such as IntelliJ IDEA.
3. Configure the desired Spring profile:
   - `test`: uses the H2 in-memory database.
   - `dev`: uses PostgreSQL.
4. For PostgreSQL, configure the `DB_URL`, `DB_USERNAME`, and `DB_PASSWORD` environment variables.
5. Run the `OrderManagementApplication.java` class or use Maven.
6. Use Postman to test the API endpoints.

To run the application with the test profile:

```bash
./mvnw spring-boot:run -Dspring-boot.run.profiles=test
```

The application will be available at `http://localhost:8080`.

## 📌 Project Status

Project developed for educational purposes, focusing on Java, Spring Boot, REST APIs, JPA/Hibernate, data persistence, entity relationships, and exception handling.

## 👩‍💻 Author

Developed by [Brenda](https://github.com/brenda-dev001), following a Java course on Udemy.