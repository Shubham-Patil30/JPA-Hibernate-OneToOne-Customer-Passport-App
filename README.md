# Customer-Passport One-to-One Relationship Project

## Description
This project demonstrates a One-to-One relationship in Hibernate JPA between `Customer` and `Passport` entities, where each customer has a single passport, with full CRUD operations on both entities.

## Features
- One-to-One relationship between `Customer` and `Passport` entities.
- Unidirectional relationship from `Customer` to `Passport`, enabling access to the associated passport.
- CRUD operations on both `Customer` and `Passport`, ensuring data integrity across the relationship.

## Technologies Used
- Java
- JPA (Java Persistence API)
- Hibernate ORM
- MySQL (or any other relational database)
- Maven for dependency management

## Project Structure
- **Entity Classes**: Contains `Customer` and `Passport` entities, where `Customer` has a one-to-one relationship with `Passport`.
- **Join Column**: Configured with `@OneToOne` and `@JoinColumn` annotations in the `Customer` entity to map the relationship.
- **DAO Classes**: Provides methods to perform CRUD operations on both `Customer` and `Passport`, maintaining referential integrity.

## Annotations Used
- `@OneToOne`: Defines the one-to-one relationship between `Customer` and `Passport`.
- `@JoinColumn`: Specifies the foreign key column in `Customer` that links to `Passport`.

## Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/Shubham-Patil30/JPA-Hibernate-OneToOne-Customer-Passport-App.git
