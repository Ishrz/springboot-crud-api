# Employee Management System

A RESTful API for performing CRUD operations on employee data using Spring Boot, Java, and MySQL.

## Features

- Create, Read, Update, and Delete (CRUD) employee records
- REST API endpoints for all operations
- Database integration with MySQL
- Spring Data JPA for data persistence
- Input validation and exception handling
- Lombok for boilerplate code reduction

## Technologies Used

- Backend: Java 17, Spring Boot 3.x
- Database: MySQL
- Framework: Spring Web, Spring Data JPA
- Tools: Lombok, Maven
- API Testing: Postman

## Installation & Setup


- Java 17 or higher
- MySQL Server
- Maven
- Postman (for API testing)

### Endpoints

POST	/api/employees Create new employee
GET	/api/employees	Get all employees
GET	/api/employees/{eId}	Get employee by ID
PUT	/api/employees/{eId}	Update employee
DELETE	/api/employees/{eId}	Delete employee

### JSON FORMAT
{
  "name": "xyz",
  "age": 30,
  "department": "HR"
}
