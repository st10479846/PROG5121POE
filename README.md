# 📱 ChatApp POE Part 3 – Message Management System

## 🔖 Overview
This project is a **Java-based message management system** built as part of the **Practical Assessment Task (POE) Part 3** for the Software Development module. It simulates sending, storing, and managing SMS-style messages, including validation, tracking, searching, and UI interaction using `JOptionPane`.

---

## 👨‍🎓 Student Details

- **Name:** Eugene Makhukhule  
- **Student Number:** ST10479846  
- **Submission Date:** 17 June 2025  

---

## 📌 Features Implemented

- ✅ Sending messages with validation  
- ✅ Storing and categorizing messages (Sent, Stored, Disregarded)  
- ✅ Length checks and validation for recipients  
- ✅ Marking messages as read  
- ✅ Creating message hashes  
- ✅ Searching messages:
  - By **Message ID**
  - By **Message Hash**
- ✅ Displaying search results via `JOptionPane` dialogs  
- ✅ Tracking all message types using static data structures  

---

## 🧪 Unit Testing

Tested using **JUnit** with the following coverage:
- Message length success/failure
- Recipient format validation
- Hash creation validation
- Read message marking and status
- Search functionality for both message ID and hash
- Longest message identification
- Overall message tracking

All tests are in `MessageTest.java` and `UserTest.java`.

---

## 🛠️ How to Run

1. Clone or download the repository.
2. Open the project in **NetBeans** or any Java-compatible IDE.
3. Ensure JDK 21 is configured (or change to your version in `pom.xml`).
4. Run the `MainApp.java` or trigger the test cases using Maven:
   ```bash
   mvn test
