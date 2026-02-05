# 🛒 Product Management REST API (Spring Boot)

This project is a Spring Boot RESTful API for managing products in an e-commerce–style application.  
It demonstrates basic CRUD operations using in-memory storage (ArrayList).

---

## 🔧 Tech Stack

- Java 17
- Spring Boot
- Spring Web
- Jakarta Bean Validation
- Maven
- Railway (Free Tier Deployment)

---

## ✨ Features

- Add a product
- Get all products
- Get product by ID
- Update a product
- Delete a product
- Input validation using Jakarta Validation
- Custom ProductNotFoundException handling

---

## ⚠️ Important Note

This application uses in-memory storage (ArrayList).  
All data is lost when the application restarts. This behavior is expected and aligns with the task requirements.

---

## 🌐 Live API Base URL

  https://javaproject-production-d57b.up.railway.app/products
> Note: On Railway free tier, the first request may take a few seconds due to cold start.

---

## 📁 Project Structure

src/main/java/com/javaProject/JavaProject
│
├── controller
│   └── ProductController.java
│
├── service
│   └── ProductService.java
│
├── model
│   └── Product.java
│
├── exception
│   └── ProductNotFoundException.java
│
└── JavaProjectApplication.java

---

## 📦 Product Model (Sample JSON)

{
  "productName": "iPhone 15",
  "description": "Latest Apple smartphone with A17 chip",
  "price": 79999.99,
  "category": "Electronics"
}

---

## 🔗 API Endpoints

### ➕ Add Product
POST /products

---

### 📄 Get All Products
GET /products

Returns an empty list if no products are available.

---

### 🔍 Get Product by ID
GET /products/{id}

Throws ProductNotFoundException if the product does not exist.

---

### ✏️ Update Product
PUT /products/{id}

---

### ❌ Delete Product
DELETE /products/{id}

---

## ❗ Error Handling

If a product is not found, the API throws a `ProductNotFoundException`.

Example response:
{
  "status": 404,
  "message": "Product with id 5 not found"
}

---

## 🛠️ Running Locally

### Prerequisites
- Java 17+
- Maven

### Steps

git clone https://github.com/gopichand63/JavaProject.git
cd JavaProject
mvn spring-boot:run

Application runs on:
http://localhost:8080

---

## 🚀 Deployment

The application is deployed on Railway using GitHub integration.

Required configuration in application.properties:
server.port=${PORT:8080}

---

## 🧠 Design Decisions

- Used in-memory storage to meet the given requirements
- Avoided database and JPA usage
- Implemented custom exception for product-not-found scenarios
- Focused on clean controller–service separation

---

## 👤 Author

Gopichand Rudroju  
Java Backend Developer

---

## ✅ Project Status

✔ Task completed  
✔ Deployed successfully  
✔ Ready for review
