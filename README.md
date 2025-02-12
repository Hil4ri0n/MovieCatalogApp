# MovieCatalogApp

## **Project Overview**

MovieCatalogApp is a web-based system built on Spring Boot to manage a catalog of movies. It uses a modular hexagonal architecture, with a MySQL database for data persistence and Docker for containerization.

---

## **Features**

- Spring Boot web application.
- Modular monolithic design with a hexagonal architecture.
- Persistent storage using a MySQL database.
- Facade design pattern for better separation of concerns.
- Comprehensive unit and integration test coverage.
- Controller tests implemented using MockMvc.
- Fully containerized using Docker.

---

## **Technologies**

Core Technologies:  
![image](https://img.shields.io/badge/17-Java-orange?style=for-the-badge) &nbsp;
![image](https://img.shields.io/badge/apache_maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white) &nbsp;
![image](https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring) &nbsp;
![image](https://img.shields.io/badge/Hibernate-59666C.svg?style=for-the-badge&logo=Hibernate&logoColor=white) &nbsp;
![image](https://img.shields.io/badge/MySQL-4479A1.svg?style=for-the-badge&logo=MySQL&logoColor=white) &nbsp;
![image](https://img.shields.io/badge/Docker-2CA5E0?style=for-the-badge&logo=docker&logoColor=white) &nbsp;

Testing Frameworks:  
![image](https://img.shields.io/badge/Junit5-25A162?style=for-the-badge&logo=junit5&logoColor=white) &nbsp;
![image](https://img.shields.io/badge/Testcontainers-9B489A?style=for-the-badge) &nbsp;

---

## **Setup and Execution**

### **Prerequisites**
- Install [Docker](https://www.docker.com/products/docker-desktop/).

### **Steps to Run**

1. Open your terminal and navigate to the project directory.
2. Run the following command to start the application:
   `docker compose up`

## Rest-API Endpoints
Service url: http://localhost:8080

| HTTP METHOD | Endpoint           |          REQUEST            |   RESPONSE   |                 Function                    |
|-------------|--------------------|-----------------------------|--------------|---------------------------------------------|
| GET         |  /movies           |              -              |     JSON     | Retrieve all available movies               |
| GET         |  /movies/{movieId} |   PATH VARIABLE (movieId)   |     JSON     | Retrieve a movie by its ID            |
| POST        |  /movies           |      BODY-JSON (movie)      |     JSON     | Add a new movie                            |
| PUT         |  /movies           |      BODY-JSON (movie)      |     JSON     | Update an existing movie                      |
| DELETE      |  /movies/{movieId} |   PATH VARIABLE (movieId)   |     JSON     | Delete a movie                               |
| POST        |  /register         | BODY-JSON (registerRequest) |     JSON     | Register a new user                        |
| POST        |  /token            |  BODY-JSON (loginRequest)   |     JSON     | Generate an access token for login |
