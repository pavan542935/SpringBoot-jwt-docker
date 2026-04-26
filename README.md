# Spring Boot JWT Authentication – Secure Backend System

##  Overview
This project implements a **secure and scalable backend system** using **Spring Boot** with **JWT-based authentication** and **role-based authorization**. The application is fully containerized using Docker and designed to reflect a real-world production backend architecture.

The system ensures secure communication between clients and APIs while maintaining a clean separation of concerns.

---

##  System Architecture


###  Core Design Principles
- Stateless authentication using JWT  
- Layered architecture (Controller, Service, Repository)  
- Role-based secure API access  

---

## 🛠️ Tech Stack
- Java 21  
- Spring Boot  
- Spring Security (JWT)  
- Spring Data JPA  
- MariaDB (MySQL-compatible)  
- Docker & Docker Compose  
- Maven  

---

## ✨ Core Features
- User registration and authentication  
- JWT-based stateless authentication  
- Role-based access control (**USER / ADMIN**)  
- Secure REST API endpoints  
- Database persistence using JPA  
- Fully containerized backend and database  
- Data persistence across container restarts  

---

## 🔐 Authentication Flow
1. User registers or logs in  
2. Server validates credentials  
3. JWT token is generated  
4. Client sends JWT in Authorization header  
5. Server validates token for each request  
6. Access granted based on user role  

---

## 📡 API Endpoints

### Authentication APIs
- `POST /auth/register` → Register a new user  
- `POST /auth/login` → Authenticate user and receive JWT  

### User APIs
- `GET /users/me` → Get current user details (JWT required)  
- `GET /users` → Accessible only by ADMIN users  

---

## 🔒 Security Implementation
- JWT used for stateless authentication  
- Passwords encrypted using BCrypt  
- Role-based authorization enforced at API level  
- Proper HTTP status codes for unauthorized access  

---

## 📂 Project Structure
- **Controller Layer** → Handles HTTP requests  
- **Service Layer** → Business logic implementation  
- **Repository Layer** → Database operations  
- **Security Layer** → Authentication & authorization  
- **Database Layer** → Stores user data  

---

## 🔄 Request Flow
1. Client sends request with JWT  
2. Security layer validates token  
3. Controller processes request  
4. Service layer executes logic  
5. Data stored/retrieved from database  
6. Response returned to client  

---

## 🐳 Docker Setup

### Prerequisites
- Docker Desktop installed and running  

### ▶️ Run the Application
docker-compose up --build

http://localhost:8080

 Testing
Tested authentication and authorization flows
Verified role-based access restrictions
Validated secure API behavior using JWT
📚 Key Learnings
Implementing JWT authentication in Spring Boot
Securing APIs using Spring Security
Designing layered backend architecture
Containerizing applications using Docker
Managing database persistence with JPA

🎯 Conclusion

This project demonstrates the development of a production-ready backend system with secure authentication, clean architecture, and containerized deployment, aligned with modern backend engineering practices.
