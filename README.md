# 🧠 Reskilla Backend
**Reskilling-as-a-Service Platform for the AI Economy**

Reskilla is an intelligent backend platform designed to help individuals, corporations, and governments navigate large-scale workforce transformation in the age of AI.  
It provides APIs for personalized reskilling journeys — from assessing existing skills to guiding users toward new, high-demand career paths.

---

## 🚀 Features

- 🔐 **User Authentication & Authorization (JWT-based)**
- 🧭 **AI-Personalized Reskilling Paths**
- 📚 **Modular Learning Tracks Management**
- 🧠 **Skill Mapping & Recommendations**
- 💼 **Job Placement Integration (Outcome-based)**
- 🗃️ **Admin, Instructor, and Learner Roles**
- 📊 **Analytics & Progress Tracking APIs**
- 🧾 **Swagger-based API Documentation**

---

## 🏗️ Tech Stack

| Layer | Technology |
|-------|-------------|
| **Backend Framework** | Spring Boot 3.x |
| **Language** | Java 17 / 21 |
| **Database** | PostgreSQL |
| **ORM** | Spring Data JPA |
| **Auth** | Spring Security + JWT |
| **Object Mapping** | MapStruct |
| **Documentation** | Springdoc OpenAPI (Swagger UI) |
| **Migrations** | Flyway |
| **Utilities** | Lombok, Validation API |

---

## ⚙️ Setup Instructions

### 1️⃣ Prerequisites
- Java 17+  
- Maven 3.9+  
- PostgreSQL (running locally or remotely)

### 2️⃣ Clone the Repository
```bash
git clone https://github.com/your-username/reskilla-backend.git
cd reskilla-backend

###Run
mvn spring-boot:run

###Project Structure

src/
 └── main/
     ├── java/com/reskilla/
     │    ├── controller/
     │    ├── dto/
     │    ├── entity/
     │    ├── repository/
     │    ├── service/
     │    └── config/
     └── resources/
          ├── db/migration/
          └── application.properties


