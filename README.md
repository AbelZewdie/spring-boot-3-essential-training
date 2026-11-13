# 🚀 Spring Boot 3 Essential Training

![Java](https://img.shields.io/badge/Java-f89820?style=flat-square&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=flat-square&logo=spring-boot&logoColor=white)
![Spring Cloud](https://img.shields.io/badge/Spring_Cloud-6DB33F?style=flat-square&logo=spring-boot&logoColor=white)
![GraphQL](https://img.shields.io/badge/GraphQL-E10098?style=flat-square&logo=graphql&logoColor=white)
![REST](https://img.shields.io/badge/REST-005571?style=flat-square&logo=postman&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-2496ED?style=flat-square&logo=docker&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-4169E1?style=flat-square&logo=postgresql&logoColor=white)

A comprehensive hands-on repository tracking my journey through the **Spring Boot 3 Essential Training** course by Frank Moley (LinkedIn Learning). This project explores modern enterprise Java development, microservices patterns, database integration, and cloud-native architecture.

---

## 🛠️ Core Stack & Architecture

* **Backend Systems:** <img src="https://img.shields.io/badge/Java-f89820?style=flat-square&logo=openjdk&logoColor=white" height="18" style="border-radius: 4px;" alt="Java"> <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=flat-square&logo=spring-boot&logoColor=white" height="18" style="border-radius: 4px;" alt="Spring Boot"> <img src="https://img.shields.io/badge/Spring_Cloud-6DB33F?style=flat-square&logo=spring-boot&logoColor=white" height="18" style="border-radius: 4px;" alt="Spring Cloud"> <img src="https://img.shields.io/badge/Microservices-6DB33F?style=flat-square&logo=spring&logoColor=white" height="18" style="border-radius: 4px;" alt="Microservices">
* **API Clients & Testing:** <img src="https://img.shields.io/badge/REST-005571?style=flat-square&logo=postman&logoColor=white" height="18" style="border-radius: 4px;" alt="REST"> <img src="https://img.shields.io/badge/GraphQL-E10098?style=flat-square&logo=graphql&logoColor=white" height="18" style="border-radius: 4px;" alt="GraphQL"> <img src="https://img.shields.io/badge/Bruno-B839FF?style=flat-square&logo=bruno&logoColor=white" height="18" style="border-radius: 4px;" alt="Bruno"> <img src="https://img.shields.io/badge/Postman-FF6C37?style=flat-square&logo=postman&logoColor=white" height="18" style="border-radius: 4px;" alt="Postman"> <img src="https://img.shields.io/badge/Insomnia-4000BF?style=flat-square&logo=insomnia&logoColor=white" height="18" style="border-radius: 4px;" alt="Insomnia">
* **Observability, Resilience & Security:** <img src="https://img.shields.io/badge/Resilience4j-20232a?style=flat-square&logo=resilience4j&logoColor=white" height="18" style="border-radius: 4px;" alt="Resilience4j"> <img src="https://img.shields.io/badge/Keycloak-1A2834?style=flat-square&logo=keycloak&logoColor=white" height="18" style="border-radius: 4px;" alt="Keycloak"> <img src="https://img.shields.io/badge/Zipkin-73B03E?style=flat-square&logo=zipkin&logoColor=white" height="18" style="border-radius: 4px;" alt="Zipkin"> <img src="https://img.shields.io/badge/Datadog-632CA6?style=flat-square&logo=datadog&logoColor=white" height="18" style="border-radius: 4px;" alt="Datadog">
* **Databases:** <img src="https://img.shields.io/badge/PostgreSQL-4169E1?style=flat-square&logo=postgresql&logoColor=white" height="18" style="border-radius: 4px;" alt="PostgreSQL"> <img src="https://img.shields.io/badge/MongoDB-47A248?style=flat-square&logo=mongodb&logoColor=white" height="18" style="border-radius: 4px;" alt="MongoDB"> <img src="https://img.shields.io/badge/MySQL-4479A1?style=flat-square&logo=mysql&logoColor=white" height="18" style="border-radius: 4px;" alt="MySQL">
* **Data Engineering & Analytics:** <img src="https://img.shields.io/badge/Python-3776AB?style=flat-square&logo=python&logoColor=white" height="18" style="border-radius: 4px;" alt="Python"> <img src="https://img.shields.io/badge/SQL-4479A1?style=flat-square&logo=sqlite&logoColor=white" height="18" style="border-radius: 4px;" alt="SQL"> <img src="https://img.shields.io/badge/PySpark-E25A1C?style=flat-square&logo=apachespark&logoColor=white" height="18" style="border-radius: 4px;" alt="PySpark"> <img src="https://img.shields.io/badge/Azure_Synapse-0089D6?style=flat-square&logo=microsoftazure&logoColor=white" height="18" style="border-radius: 4px;" alt="Azure Synapse"> <img src="https://img.shields.io/badge/Jupyter_Notebook-F37626?style=flat-square&logo=jupyter&logoColor=white" height="18" style="border-radius: 4px;" alt="Jupyter Notebook">
* **Infrastructure & Deployment:** <img src="https://img.shields.io/badge/Docker-2496ED?style=flat-square&logo=docker&logoColor=white" height="18" style="border-radius: 4px;" alt="Docker">

---

## 📁 Project Structure

This repository is organized into modular training sections and practical applications:

* `booting/` — Core configuration management, conditional loading, and custom property profiles (`dev`/`prod`).
* `room-clr/` — Command-line runner utilities interacting with external REST services via `RestTemplate`.
* `room-web-app/` — Full Spring Boot Web application implementing the **MVC Pattern** (Model-View-Controller), Thymeleaf templates, Spring Data JPA repositories, and PostgreSQL integration.
* `notes/` — Detailed personal learning logs and Obsidian markdown notes documenting key concepts.

---

## 🚀 Getting Started

### Prerequisites
* Java JDK 17+
* Docker Desktop (for local PostgreSQL database containerization)
* Maven

### Running the Database Container
You can spin up the required local PostgreSQL container using the provided shell script or Docker command:
```bash
# Using the helper script
./bin/postgres_start.sh

# Or directly via Docker
docker run -d --rm --name pg-docker -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=local -p 5432:5432 postgres:17.2
