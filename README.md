E_Commers_System:-
Product Management and Order Processing System built using Spring Boot, Spring Data JPA, Hibernate, MySQL, and Spring Security.

Project Overview:-

This project implements a backend system with role-based access control and inventory validation. It supports product management, order processing, and user role management.

Technologies Used:-
Java 17+
Spring Boot 3
Spring Data JPA
Hibernate
Spring Security (Basic Authentication)
MySQL
Maven
Lombok

Database Name:-E_Commers_DB

Features
User Role:-
           - View products
           - Place order
           - Inventory validation before checkout
           - Order creation with total calculation

Admin Role:
            - Add products
            - Update products
            - Manage inventory
            -  Enable or disable products

            
Super Admin Role:
             - Manage users
             - Manage roles
             - Manage categories
             - View all orders

Core Logic:-
Inventory is validated before placing order.
If quantity is insufficient, order is rejected.
Inventory reduces after successful order.
Layered architecture: Controller → Service → Repository.
Custom exception handling implemented.


Project Structure:-
-  com.ecommers.system
-  controller
-  service
-  service.impl
-  repository
-  model
-  exception
-  config


How to Run
Create database in MySQL:
CREATE DATABASE E_Commers_DB;
Update application.properties with your MySQL username and password.
Run as Spring Boot Application.(Main Class)

Server runs on:
http://localhost:8080

Sample API

Place Order:
POST /api/orders?userId=1&productId=1&qty=2
