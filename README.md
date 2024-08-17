# SpringBoot-MethodArguementNotValidException

This Spring Boot project demonstrates how to handle `MethodArgumentNotValidException`, which is commonly thrown when validation on an argument annotated with `@Valid fails. The project is built using Maven and integrates with a relational database to provide a practical example of validating request data and managing validation errors.

## Features
- `Spring Boot`: A framework to build stand-alone, production-grade Spring-based applications.
- `Maven`: Dependency management and build automation.
- `JPA`: Java Persistence API for database operations.
- `MariaDB`: Relational database management system used for storing application data.
- `Custom Exception Handling`: Custom exception handling for DataIntegrityViolationException.
- `Validation`: Input validation to prevent data integrity violations.
- `Swagger`: API documentation and testing.

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MariaDB (can be replaced with any other database)
- Swagger

## Getting Started

### Prerequisites

- Java 8 or higher
- Maven 3.6 or higher

### Installation

1. Clone the repository:
   ```sh
   git clone https://github.com/Vivek1099/Springboot-MethodArguementNotValidException.git
   cd Springboot-MethodArguementNotValidException

2. Configure the database:

    Update the src/main/resources/application.properties file with your database connection details:
     ```sh
    spring.datasource.url=jdbc:mariadb://localhost:3306/your_database_name
    spring.datasource.username=your_username
    spring.datasource.password=your_password
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
   
3. Build the project:
   ```sh
     mvn clean install
4. Run the application:
   ```sh
     mvn spring-boot:run
The application will start on http://localhost:8080.

### Endpoints

1. Test Endpoint
- URL: `/test`
- Method: GET
- Description: Test the API to ensure it's running
- Response: "This is Method Arguement Not Valid Exception Test"

2. Save Data
- URL: `/save`
- Method: POST
- Description: Add new user data.
- Request Body: json in postman
  
  ```sh
  {
    "name": "Vivek Sawaiyan",
    "email": "vivek@gmail.com",
    "mobile": "7903776378",
    "gender": "Male",
    "age": 18,
    "nationality": "Indian"
  }

3. Get All Employee Data
- URL: `/show`
- Method: GET
- Description: Returns a list of all users data.
  
  ```sh
  [
  {
    "userId": 1,
    "name": "Vivek Sawaiyan",
    "email": "vivek@gmail.com",
    "mobile": "7903776378",
    "gender": "Male",
    "age": 18,
    "nationality": "Indian"
  }
  ]
  
4. Retreving data using Id.
- URL: `/byid/{userId}` or `byname{name}`
- Method: GET
- Description: Returns user data of specific id.

5. Validation
- name: Must not be empty, and must be at least 4 characters long, should not contain any special characters.
- phoneno: Must start form no between 6 to 9(as per Indian Phone no) and must be of 10 digits and must be unique.

## Exception Handling
The application includes a global exception handler that captures `DataIntegrityViolationException` and returns a meaningful error response.
```sh
Phone Number Already Exist
```

## Project Structure

- Employee: Entity class representing a user profile.
- EmployeeRepository: Repository interface for CRUD operations on user profiles.
- EmployeeController: REST controller for handling user-related requests.
- GlobalExceptionHandler: Global exception handler for validation errors.


