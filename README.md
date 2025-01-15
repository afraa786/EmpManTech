# Employee Management System

## Overview

The **Employee Management System (EMS)** is a full-stack application that allows users to manage employee records, including adding, deleting, and fetching employee data. The system uses a **backend with JDBC** for data management and **a frontend built with HTML, CSS, and JavaScript** for a user-friendly interface.

## Features

- **Add Employee**: Allows the addition of new employees with details such as name, email, and phone.
- **Delete Employee**: Deletes an employee record by providing their ID.
- **Fetch Employees**: Fetches and displays a list of all employees stored in the database.
- **Authentication & Authorization**: Uses Spring Security to authenticate users and authorize access to specific endpoints.

## Tech Stack

### Backend

- **Java 17**: The core programming language for backend development.
- **JDBC (Java Database Connectivity)**: Used for database interactions, performing CRUD operations on the MySQL database using raw SQL queries.
- **MySQL**: The relational database used to store employee data.
- **Spring Security**: Used for implementing authentication and authorization in the application.

### Frontend

- **HTML**: Used for the structure of the employee management system.
- **CSS**: Applied to style the webpage and ensure a responsive, clean interface.
- **JavaScript**: Used to handle user interactions like form submissions and displaying employee data dynamically from the backend.

## Installation & Setup

 **Clone the repository**:
   ```bash
   git clone https://github.com/yourusername/EmployeeManagementBackend.git
   cd EmployeeManagementBackend
 ```

Configure MySQL Database:

### JDBC

Create a MySQL database named employee_management (or your preferred name)
Update the application.properties file with your database credentials:
 ```bash
properties

spring.datasource.url=jdbc:mysql://localhost:3306/employee_management

spring.datasource.username=your_username

spring.datasource.password=your_password

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
 ```

### Run the application:

Ensure you have Java 17+ installed.

Use the following command to run the application:
  ```bash
mvn spring-boot:run
 ```
Access the API:

The backend will be available at  
```bash 
http://localhost:8090/api
 ```
