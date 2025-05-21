# 📚 Console Based Application - Spring ORM + Hibernate CRUD App

This is a **console-based Java application** that performs CRUD (Create, Read, Update, Delete) operations on a `Student` entity using **Spring ORM with Hibernate**. The project connects to a database using Hibernate and provides a simple console interface for interacting with student data.

---

## ✅ Features

- ➕ Add a new student
- 🔍 Get student details by ID
- 📋 List all students
- 🗑️ Delete a student
- ✏️ Update student details
- 🔚 Exit the application

---

## 🏗️ Technologies Used

- Java 8+
- Spring ORM
- Hibernate
- Maven
- MySQL (or any JDBC-supported DB)
- JDBC
- Console-based I/O

---

---

## 🧑‍💻 How to Run

### 1️⃣ Prerequisites

- Java installed
- Maven installed
- MySQL or another database set up
- Your DB must have a `Student_details` table with the following columns:

```sql
CREATE TABLE Student_details (
  id INT PRIMARY KEY,
  name VARCHAR(100),
  dept VARCHAR(100),
  section VARCHAR(100)
);

```
---

3️⃣ Configure Database
Update DB connection details inside your ormconfig.xml or Spring config file:
```
<property name="connection.url">jdbc:mysql://localhost:3306/your_db</property>
<property name="connection.username">your_username</property>
<property name="connection.password">your_password</property>
```
---

## 👤 Author

**Rajni**  
🎯 Aspiring Java Backend Developer  
🔗 [GitHub Profile](https://github.com/rajni2209)
