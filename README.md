# Spring Boot Scheduling

A simple project built with **Spring Boot** and **MongoDB** that uses a scheduler to automatically add and fetch the total number of users available in the database.   
This project helped me understand how scheduling works in Spring Boot and how to connect it with a MongoDB database.

---

## Features
- Connects Spring Boot with MongoDB  
- Uses a scheduler to insert random users automatically  
- Fetches user data from MongoDB  
- Simple and beginner-friendly structure  

---

## Technologies Used
- Java 21  
- Spring Boot 3.5.7 
- MongoDB  
- Maven  

---

## Project Structure
```text
src/main/java/com/som/
├── model/
│ └── User.java
├── repo/
│ └── UserRepo.java
├── service/
│ └── UserService.java
└── SpringBootSchedulingApplication.java
src/main/resources/
└── application.properties
pom.xml
```
---

## How to Run
1. Make sure MongoDB is running on `localhost:27017`  
2. Update `application.properties` if needed  
3. Run the application
4. The scheduler will start adding random users automatically.
   You can check the data in MongoDB Compass or from the Mongo shell.

---

## What I Learned
- How to use @Scheduled in Spring Boot
- How to connect Spring Boot with MongoDB
- How to automate background tasks
