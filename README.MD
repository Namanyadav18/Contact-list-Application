# Contact List Application

**(Using Collections Framework and File Handling in Java)**

## 📌 Project Overview

The Contact List Application is a Java-based console program that allows users to **store, search, delete, and persist contact information**.
It uses **HashMap** from the Collections Framework for efficient data storage and **File Handling** to save and load contacts from a file.

---

## 🎯 Objectives

* Use Java **Collections Framework**
* Implement **HashMap** for fast retrieval
* Perform **file read/write operations**
* Persist data between program executions
* Build a menu-driven application

---

## 🧱 Class Design

### 1. Contact Class

**Attributes**

* name (String)
* phoneNumber (String)
* email (String)

### 2. ContactManager Class

**Features**

* Stores contacts using `HashMap<String, Contact>`
* Add, search, remove contacts
* Save contacts to a file
* Load contacts from a file

### 3. ContactListApp (Main Class)

* Menu-driven user interface
* Handles user input and exceptions

---

## 🖥️ Sample Menu

```
1. Add Contact
2. Search Contact
3. Display All Contacts
4. Save to File
5. Load from File
6. Exit
```

---

## 📂 File Handling

* Contacts are stored in `contacts.txt`
* Uses `BufferedReader` and `BufferedWriter`
* Data format:

  ```
  Name,PhoneNumber,Email
  ```

---

## 🛠️ Technologies Used

* Java
* Collections Framework (HashMap)
* File Handling
* Exception Handling
* Scanner class

---

## ✅ Learning Outcomes

* Hands-on experience with Java I/O
* Understanding data persistence
* Efficient data management using collections

---

## 👤 Author

**NAMAN**
Capstone Assignment – Java Programming
