# Biblioteca - Project Overview

A Spring Boot application providing a simplified interface for registering books and allowing users to view the catalog.

## Technologies
- **Java:** 21
- **Framework:** Spring Boot 3.5.13
- **Database:** MySQL
- **ORM:** Spring Data JPA
- **Mapping:** MapStruct 1.6.3
- **Environment Management:** `dotenv-java` for loading configuration from a `.env` file.

## Architecture & Design Patterns
- **Web Layer:** Spring Web for RESTful endpoints.
- **Service Layer:** Business logic for book management.
- **Data Access:** Spring Data JPA for persistence.
- **Mapping:** MapStruct for DTO/Entity transformations.
- **Exception Handling:** Centralized via `GlobalExceptionHandler`.

## Required Environment Variables
The application expects a `.env` file in the root directory:
- `DB_URL`: JDBC URL for MySQL.
- `DB_USERNAME`: Database user.
- `DB_PASSWORD`: Database password.

## Building and Running
- **Build:** `./mvnw clean install`
- **Run:** `./mvnw spring-boot:run`

## Development Conventions
- **Scope focus:** Maintain a lean codebase focused strictly on book registration and retrieval.
- **Configuration:** Use `.env` for all environment-specific settings.
- **Mapping:** Use MapStruct for Entity/DTO conversion to ensure clean service logic.

## TODO / Scope Implementation
- [ ] Create `Livro` entity with registration and display attributes.
- [ ] Implement `LivroRepository` for basic CRUD operations.
- [ ] Develop `LivroService` to handle registration and listing logic.
- [ ] Create `LivroController` with endpoints for POST (register) and GET (view).
- [ ] Update `GlobalExceptionHandler` and add required exception classes.
- [ ] (Optional) Implement a simple frontend or Thymeleaf templates for user interaction.
