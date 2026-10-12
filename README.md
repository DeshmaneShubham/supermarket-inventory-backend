# 🛒 Supermarket Inventory Management System - Backend

A Spring Boot REST API for managing mini supermarket inventory. Provides CRUD operations for supermarket products with persistent MySQL storage and Hibernate/JPA.

---

## 📋 Table of Contents

- [Features](#features)
- [Tech Stack](#tech-stack)
- [Project Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [Configuration](#configuration)
- [API Endpoints](#api-endpoints)
- [How to Run](#how-to-run)
- [License](#license)

---

## ✨ Features

- **Add Product** — Register new supermarket items with name, price, and category.
- **Fetch Products** — Retrieve the complete catalog of inventory products.
- **Find Product by ID** — Search individual products by their unique primary key.
- **Update Product** — Modify existing product details by ID.
- **Delete Product** — Remove discontinued items from inventory.
- **CORS Enabled** — Configured to seamlessly integrate with any web or mobile frontend.

---

## 🛠️ Tech Stack

| Component | Technology | Version |
|---|---|---|
| Language | Java | 17 |
| Framework | Spring Boot | 3.x / 4.x compatible |
| ORM / Persistence | Spring Data JPA / Hibernate | Latest |
| Database | MySQL | 8.x |
| Build Tool | Apache Maven | 3.9+ |

---

## 📂 Project Structure

```
Inventory/
├── src/main/java/com/Supermarket/Inventory/
│   ├── InventoryApplication.java       # Spring Boot main class
│   ├── Controller/
│   │   └── ProductController.java      # REST controller with CORS
│   ├── Entity/
│   │   └── Product.java                # JPA Entity with auto-increment ID
│   ├── Repository/
│   │   └── ProductRepo.java            # Spring Data JPA repository
│   └── Service/
│       └── ProductService.java         # Business logic layer
├── src/main/resources/
│   └── application.properties          # Database connection settings
├── pom.xml
└── README.md
```

---

## ⚙️ Configuration & Prerequisites

### Prerequisites
- JDK 17+ installed and configured
- MySQL Server 8.x running locally on port `3306`

### Database Setup
Ensure the target database exists in MySQL:
```sql
CREATE DATABASE productList;
```

Check `src/main/resources/application.properties`:
```properties
spring.application.name=Inventory
spring.datasource.url=jdbc:mysql://localhost:3306/productList
spring.datasource.username=root
spring.datasource.password=4321
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## 📡 API Endpoints

| HTTP Method | Endpoint | Description | Request Body |
|---|---|---|---|
| `POST` | `/saveProduct` | Add a new product | `{"name": "Milk", "price": 45.0, "category": "Dairy"}` |
| `GET` | `/allProducts` | Fetch all products | None |
| `GET` | `/product/{id}` | Fetch product by ID | None |
| `PUT` | `/update/{id}` | Update product by ID | `{"name": "Full Cream Milk", "price": 48.0, "category": "Dairy"}` |
| `DELETE` | `/delete/{id}` | Delete product by ID | None |

---

## 🚀 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/DeshmaneShubham/supermarket-inventory-backend.git
   cd supermarket-inventory-backend
   ```
2. Build the project:
   ```bash
   ./mvnw clean package
   ```
3. Run the application:
   ```bash
   ./mvnw spring-boot:run
   ```
4. The server runs at `http://localhost:8080`.
