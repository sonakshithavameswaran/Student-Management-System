# Student Management System

## Overview

The Student Management System is a simple console-based Java application designed to manage student information efficiently. The application allows users to add, view, search, update, and delete student records through a simple menu-driven interface.

The project is developed using Core Java and Object-Oriented Programming concepts. It is suitable for beginners who want to understand how Java classes, objects, methods, constructors, encapsulation, ArrayList, loops, conditional statements, and switch-case statements are used in a practical application.

## Features

* Add a new student
* View all student records
* Search for a student using Student ID
* Update student information
* Delete a student record
* Calculate student grade based on marks
* Menu-driven console interface
* Stores student records using ArrayList

## Technologies Used

* Java
* Object-Oriented Programming
* ArrayList
* Scanner
* VS Code / Eclipse IDE
* Git and GitHub

## Project Structure

```text
StudentManagementSystem/
│
├── Main.java
├── Student.java
└── StudentManagementSystem.java
```

### Main.java

The `Main` class is the entry point of the application. It displays the menu, accepts user input, and calls the required operations.

### Student.java

The `Student` class represents a student. It stores the student's:

* Student ID
* Name
* Age
* Course
* Marks
* Grade

It also contains getters, setters, a constructor, and a method to calculate the grade.

### StudentManagementSystem.java

This class manages the collection of students. It contains methods to:

* Add students
* View students
* Search students
* Update students
* Delete students

Student records are stored using an `ArrayList`.

## Grade Calculation

The system calculates grades based on the student's marks.

| Marks    | Grade |
| -------- | ----- |
| 90 - 100 | A+    |
| 80 - 89  | A     |
| 70 - 79  | B     |
| 60 - 69  | C     |
| 50 - 59  | D     |
| Below 50 | F     |

## How to Run

### Step 1: Clone the Repository

```bash
git clone YOUR_REPOSITORY_URL
```

### Step 2: Open the Project

Open the project folder using VS Code or Eclipse.

### Step 3: Compile the Java Files

Open the terminal inside the project folder and run:

```bash
javac *.java
```

### Step 4: Run the Application

```bash
java Main
```

## Application Menu

```text
======================================
       STUDENT MANAGEMENT SYSTEM
======================================
1. Add Student
2. View All Students
3. Search Student
4. Update Student
5. Delete Student
6. Exit
======================================
Enter your choice:
```

## Concepts Used

This project demonstrates several important Java concepts:

* Classes and Objects
* Constructors
* Encapsulation
* Private variables
* Getters and Setters
* Methods
* ArrayList
* Scanner
* Loops
* If-else statements
* Switch-case
* Return statements
* Basic CRUD operations

## CRUD Operations

The project follows the basic CRUD concept:

```text
Create  → Add Student
Read    → View/Search Student
Update  → Update Student
Delete  → Delete Student
```

## Future Enhancements

The project can be further improved by adding:

* Database connectivity using MySQL
* Login and authentication
* Attendance management
* Subject-wise marks
* Student attendance percentage
* File-based data storage
* Student report generation
* Graphical User Interface
* Export student records to CSV or PDF

## Purpose

The main purpose of this project is to demonstrate the practical implementation of Java programming and Object-Oriented Programming concepts through a simple student record management application.

## Author

Developed as a Java learning and practice project.

## License

This project is created for educational and learning purposes.
