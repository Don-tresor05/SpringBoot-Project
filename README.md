# SpringBoot-Project
This is a Spring-Boot application designed to manage user data. The API performs CRUD (Create, Read, Update, Delete) operations and is connected to MySQL database.

## Features
➖ API for User Management
➖ Database Integrarion with MySQL
➖ Implements CRUD operations
➖ Easy-to-use endpoints for managing users

## API Endpoints

### 1. @@Create User@@
➖ **URL**: `http://localhost:8080/api/users`
➖ **Method**: POST
➖ **Body**: json

      {
        "name": "String",
        "email": "String"
      }

      🔷Response🔷

      {
        "id": "Long",
        "name": "String",
        "email": "String"
      }

### 2. @@Get All Users@@
➖ **URL**: `http://localhost:8080/api/users`
➖ **Method**: GET
➖ **Body**: json

      🔷Response🔷

     [    
      {
        "id": "Long",
        "name": "String",
        "email": "String"
      }
      ]


### 3. @@Get User by ID@@
➖ **URL**: `http://localhost:8080/api/users/{id}`
➖ **Method**: GET
➖ **Body**: json

      🔷Response🔷

      {
        "id": "Long",
        "name": "String",
        "email": "String"
      }

### 4. @@Update User@@
➖ **URL**: `http://localhost:8080/api/users/{id}`
➖ **Method**: PUT
➖ **Body**: json

      {
        "name": "String",
        "email": "String"
      }

      🔷Response🔷

     [    
      {
        "id": "Long",
        "name": "String",
        "email": "String"
      }
      ]

### 5. @@Delete@@
➖ **URL**: `http://localhost:8080/api/users/{id}`
➖ **Method**: DELETE


                 💠💎Tools & Technologies💠💎
                     🎈 Java 17
                     🎈 Spring-Boot
                     🎈 MySQL
                     🎈 Maven 
                     🎈 Thunder Client
