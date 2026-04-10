# Library Record Management System (Java File Handling)

## Prepared By:

Name: Madina Mulani

---

## Abstract

The Library Record Management System is a console-based Java application developed to manage book records using file handling techniques. The system allows users to add, view, search, update, and delete book records. Data is stored persistently in a file (books.dat) using Java Serialization, ensuring that records remain available even after program termination.

---

## Introduction

Managing library records manually can lead to errors, duplication, and data loss. To address this issue, a simple and reliable software-based solution is required. This project provides a menu-driven application that efficiently manages book information using Core Java without any database dependency.

---

## Objectives

* To develop a console-based library management system
* To store book data using file handling and serialization
* To perform CRUD (Create, Read, Update, Delete) operations
* To ensure proper validation of user inputs

---

## Technologies Used

* Core Java
* Java File Handling
* Serialization
* Collections (ArrayList)
* Exception Handling

---

## Functionalities

1. Add Book
2. View All Books
3. Search Book by ID
4. Update Book
5. Delete Book
6. Exit System

---

## Project Structure

* Book.java
* FileHandler.java
* Main.java
* books.dat (generated at runtime)

---

## How to Run

1. Compile the program:
   javac Book.java FileHandler.java Main.java

2. Run the program:
   java Main

---

## Output

Screenshots demonstrating the working of each functionality are included in the submission.

<img width="759" height="364" alt="image" src="https://github.com/user-attachments/assets/fe3b1a28-1532-45c3-8475-3e2676881733" />



---

## Advantages

* Simple and user-friendly interface
* No requirement of database
* Ensures persistent storage of data
* Demonstrates core Java concepts effectively

---

## Limitations

* Console-based interface only
* Supports single-user operation
* Not suitable for handling large-scale data

---

## Future Enhancements

* Implementation of GUI using Java Swing or JavaFX
* Integration with database systems such as MySQL
* Addition of authentication and security features
* Advanced search, sorting, and filtering options

---

## Conclusion

The Library Record Management System successfully demonstrates the implementation of file handling and object serialization in Java. It provides a complete solution for managing book records with persistent storage and proper validation, making it a useful academic project for understanding core Java concepts.
