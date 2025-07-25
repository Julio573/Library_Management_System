# 📚 Library Management System (Java Console-Based)

This is a **fully object-oriented library management system** developed in **pure Java**, without the use of frameworks like Spring or Hibernate. The goal is to simulate a real-world application for managing books, authors, members, and loan operations, focusing on Java fundamentals, clean architecture, and JDBC for database interaction.

---

## 🚀 Features

- 📖 Book registration with title, author, ISBN, publication date, genre, and quantity  
- 🧑‍💼 Author registration with name, birthdate, nationality, and biography  
- 🙋 Member registration with personal details and unique email  
- 📚 Book loan and return system  
- 💸 Fine calculation based on overdue days using `BigDecimal`  
- 📅 Use of Java Date and Time API to manage loan/return dates  
- 📊 Report generation for:
  - Active and overdue loans
  - Members with outstanding fines
  - Books by author, genre, etc.  
- ✅ Validation rules (e.g., unique ISBN and email, book availability)  
- 🔁 Fully interactive console interface using `Scanner`  

---

## 🛠️ Technologies Used

- Java 21+
- JDBC (no JPA/Hibernate)
- MySQL or PostgreSQL (can be configured)
- Java Collections (`Set`, `Map`, etc.)
- Java 8+ features: Lambdas, Streams, Enums, Functional Interfaces
- Exception handling and input validation

---

## 🧩 Architecture

src/
├── app/ # Application entry point and console interface
├── model/ # Domain entities (Book, Author, Member, Loan)
├── repository/ # JDBC-based data access layer (DAOs)
├── service/ # Business logic layer
├── utils/ # Connection factory and helper utilities
└── database/ # SQL schema files (optional)


---

## 💡 Educational Goals

This project is designed to:

- Reinforce **Object-Oriented Programming** (inheritance, encapsulation, polymorphism)
- Provide hands-on experience with **manual SQL and JDBC**
- Strengthen understanding of **data modeling** and **business rules**
- Practice working with **Streams**, **Lambdas**, and modern Java syntax
- Encourage **clean code practices** and **project modularization**

---

## ✅ Requirements

- Java 21+
- A relational database (MySQL, PostgreSQL, or SQLite)
- IDE or text editor of choice
- Git for version control

---

## 📌 Status

🟢 In development – Core features implemented.  
📅 Future improvements may include automated tests, command-line arguments, and data export.

