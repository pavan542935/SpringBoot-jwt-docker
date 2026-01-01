🚀 Spring Boot JWT Authentication with Docker

A backend application built using Spring Boot that implements JWT-based authentication, role-based authorization, and is fully Dockerized with a relational database.

This project demonstrates a real-world backend architecture with security, persistence, and containerized deployment.

🛠️ Tech Stack

Java 21

Spring Boot

Spring Security (JWT)

Spring Data JPA

MariaDB (MySQL-compatible)

Docker & Docker Compose

Maven

✨ Features

User registration and login

JWT-based authentication

Role-based access control (USER / ADMIN)

Secure REST endpoints using Spring Security

RESTful APIs

Database persistence using JPA

Fully Dockerized application and database

Data persistence across container restarts

🏗️ Project Architecture

The application follows a layered architecture for better separation of concerns:

Controller Layer – Handles HTTP requests and responses

Service Layer – Contains business logic

Repository Layer – Manages database operations

Security Layer – Handles authentication and authorization

Database Layer – Stores user data

🔐 JWT is used for stateless authentication, and role-based authorization is enforced at the API level.



🐳 How to Run the Project (Using Docker)
Prerequisites

Docker Desktop installed and running

Steps

Clone or download the repository

Navigate to the project root directory

Run the following command:

docker-compose up --build

🌐 Application URL

Once the containers are running, the application will be available at:

http://localhost:8080


✔ One command
✔ Clean setup
✔ Professional deployment

🔗 API Endpoints
🔐 Authentication

POST /auth/register
Registers a new user

POST /auth/login
Authenticates the user and returns a JWT token

👤 User APIs

GET /users/me
Returns details of the currently logged-in user
(JWT required)

GET /users
Accessible only by ADMIN users

🔒 Security

JWT is used for authentication

Passwords are encrypted using BCrypt

Role-based access control is enforced

Unauthorized access returns appropriate HTTP status codes

✅ Final Note

This project is designed to reflect real-world backend development practices, including security, clean architecture, and containerized deployment.
