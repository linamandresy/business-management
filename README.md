# Business Management System

An enterprise-grade web application to streamline business operations: task management, scheduling, reporting, and user management.

![Project Architecture](./docs/architecture.png)  
*Architecture diagram placeholder — frontend ↔ backend ↔ database*

---

## 🛠️ Technologies Used

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.5.0-6DB33F?style=flat&logo=spring&logoColor=white)
![Angular](https://img.shields.io/badge/Angular-19.2.14-DD0031?style=flat&logo=angular&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-14.15-336791?style=flat&logo=postgresql&logoColor=white)

- **Backend:** Java, Spring Boot 3.5.0  
- **Frontend:** Angular 19.2.14  
- **Database:** PostgreSQL 14.15  
- **Build Tools:** Maven (backend), Angular CLI (frontend)  
- **Version Control:** Git  

---

## 🚀 Features

- **Task Management:** Create, assign, and track tasks efficiently  
- **Scheduling:** Integrated calendar for appointments and deadlines  
- **Reporting:** Generate real-time analytics reports  
- **User Management:** Role-based access control (employees & managers)  

---

## 📦 Installation

### Prerequisites

- Java 17+  
- Maven 3.6+  
- Node.js & npm  
- PostgreSQL 14+  

### Steps

```bash
git clone https://github.com/linamandresy/business-management.git
cd business-management
```
#### Backend
```bash
mvn clean install
mvn spring-boot:run
```
### Frontend
```bash
cd web
npm install
ng serve
```