# Java Chat System - POE Project (Part 1 & Part 2)

Student Name: Eugene Makhukhule
Student Number:ST1047984

## 📚 Overview

This project is developed as part of a Portfolio of Evidence (POE) submission for a Java programming course. It consists of a **basic GUI-based Chat System** that allows:
- User registration
- Login with validation
- Message composition
- Options to send, store, or disregard a message

---

## 🧩 Part 1: Basic Functionality

### ✔️ Features
- Username and password validation
- Cellphone number validation
- Registration and Login via `JOptionPane` GUI
- Login status feedback

### 📁 Key Files
- `User.java`: Contains the `User` class with login logic and validation feedback.
- `Validator.java`: Utility class for validating usernames, passwords, and phone numbers.
- `Main.java`: Runs the registration/login logic using `startChat()`.

---

## 🧩 Part 2: Message System

### ✔️ Features
- Message composition
- GUI dialog for action selection: **Send**, **Disregard**, or **Store for Later**
- Option to store messages in memory or a local file

### 📁 Key Files
- `Message.java`: Contains logic for composing, sending, and storing messages.
- `Main.java`: Extended with message handling after login.

---

## 🧪 Test Files / Scenarios

### ✅ `ValidatorTest.java`
Unit tests for:
- `checkUserName()`
- `checkPasswordComplexity()`
- `checkCellPhoneNumber()`

### ✅ `UserTest.java`
Test cases for:
- Login success and failure scenarios
- Registration object creation

### ✅ `MessageTest.java` *(Optional)*
Simulated logic to:
- Compose and verify message content
- Simulate storing a message to a file or memory

---

## 🛠️ How to Run

1. Open the project in your Java IDE (e.g., IntelliJ, NetBeans, Eclipse).
2. Run `Main.java`.
3. Follow the GUI prompts to:
   - Register
   - Login
   - Compose a message
   - Choose how to handle the message
4. For unit tests, run `ValidatorTest.java`, `UserTest.java`, and `MessageTest.java`.

---

## ✅ Dependencies
- Java SE (JDK 8 or above)
- No external libraries needed (uses built-in `javax.swing.JOptionPane` for GUI)

---

## 👨‍💻 Authors
- **Eugene Makhukhule**
- Developed for educational purposes under the guidance of [Your Institution or Lecturer Name].

---

## 📅 Submission
- **Part 1 Due:** 14 April 2025
- **Part 2 Due:** 26 May 2025

---

## 📝 Notes
- Ensure that all classes are in the correct package.
- GUI components must not be skipped. All prompts use `JOptionPane`.
- When storing messages, you can simulate file storage or use an `ArrayList` in memory for this POE level.

---

