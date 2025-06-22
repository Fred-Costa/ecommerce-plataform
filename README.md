# 🛒 Microservice E-Commerce Platform

Personal project developed with a focus on **microservices architecture**, **DevOps practices**, and **deployment to AWS**.

This platform simulates a modern e-commerce system where each domain (products, orders, payments) is built as an independent microservice, communicating through REST APIs.

---

## 🚀 Tech Stack

- **Java 17** + **Spring Boot** (RESTful APIs)
- **PostgreSQL** (data persistence)
- **Docker & Docker Compose** (local development and containerization)
- **AWS** (EKS, RDS, S3, API Gateway – planned in future phases)
- **CI/CD** with CodePipeline, CodeBuild, and CodeDeploy
- **Swagger/OpenAPI** for API documentation
- **JUnit & Mockito** for testing

---

## 📁 Project Structure

```bash
ecommerce-platform/
├── docker-compose.yaml             # Runs PostgreSQL + product-service
├── services/
│   └── product-service/            # Spring Boot microservice for product management
│       ├── Dockerfile
│       └── src/main/resources/
│           ├── application.properties
│           └── application-docker.properties
└── infrastructure/                 # (Kubernetes, Terraform, CI/CD to be added later)
```

---

## ⚙️ How to Run Locally

1. Clone the repository:
   ```bash
   git clone https://github.com/your-user/ecommerce-platform.git
   cd ecommerce-platform
   ```

2. Build the microservice JAR:
   ```bash
   cd services/product-service
   ./mvnw clean package -DskipTests
   cd ../../
   ```

3. Run containers:
   ```bash
   docker compose up --build
   ```

4. Access the API:
   - `http://localhost:8080/products` *(once endpoints are implemented)*

---

## 🎯 Project Goals

- Practice real-world **DevOps workflows** and cloud-native patterns
- Strengthen skills in **Java microservices development**
- Build a robust portfolio project for interviews
- Prepare for the **AWS Developer – Associate** certification

---

## ✅ Roadmap

- [x] Spring Boot setup with Docker
- [x] PostgreSQL integration
- [ ] REST endpoints for product service
- [ ] Swagger documentation
- [ ] CI/CD pipeline (CodePipeline)
- [ ] Deploy to AWS EKS
- [ ] Add order and payment services