# Spring Exception Handler Demo

This is a Spring Boot project demonstrating **global exception handling**, **DTO-based layered architecture**, and **Swagger API documentation**. The project manages basic `Employee` and `Department` entities with structured error responses.

---

## 🚀 Features

- ✅ Global Exception Handling with `@ControllerAdvice`
- ✅ Custom `BaseException` and structured error responses
- ✅ Clean Layered Architecture (Controller, Service, Repository, DTO)
- ✅ Scheduled task example with `@Scheduled`
- ✅ Swagger UI integration
- ✅ JPA Entities and Spring Data Repositories
- ✅ Spring Boot 3.x and Java 17 compatible

---

## 📦 Tech Stack

- Java 17
- Spring Boot 3.5.3
- Spring Web
- Spring Data JPA
- H2 (in-memory database)
- Swagger (OpenAPI)
- Maven

---

## 🧪 Running the Project

```bash
# Clone the repository
git clone https://github.com/seyitogluhalit/spring-exception-handler.git
cd spring-exception-handler

# Run the project with Maven
./mvnw spring-boot:run
Or you can run it directly from Spring Tools for Eclipse.

📚 API Docs
Once the application is running, you can access Swagger UI at:
http://localhost:8080/swagger-ui/index.html
Here you can test endpoints like:

GET /employees

POST /employees

And see structured error responses

🛑 Global Error Handling
The GlobalExceptionHandler class catches and formats exceptions like:

Resource not found

Invalid input

Custom business rules
{
  "message": "Employee not found",
  "messageType": "ERROR",
  "status": 404,
  "timestamp": "2025-06-29T13:45:00"
}
⏰ Scheduled Task
A scheduled task is included to print numbers from 0 to 10 every day at 14:45:
@Scheduled(cron = "0 45 14 * * *")
👨‍💻 Author
Developed by Halit Onur Seyitoğlu
Mail: shalitonur@gmail.com

