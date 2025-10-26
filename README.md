# Java Password Hasher

This is a simple **Java-based password encryption and verification tool** that demonstrates how to use the **BCrypt** hashing algorithm to securely store and check passwords.  
It follows **Object-Oriented Programming (OOP)** principles and performs basic file writing operations to save user credentials.

---

## Features
- Takes **User ID** and **Password** as input.  
- Hashes the password securely using **BCrypt**.  
- Saves the **User ID** and **Hashed Password** into a file.  
- Verifies the password entered by the user against the stored hash.  
- Simple and educational — perfect for beginners learning file I/O and encryption in Java.

---
## Requirments
You need the jBCrypt library to hash and verify passwords.

Download it from:
🔗 https://mvnrepository.com/artifact/org.mindrot/jbcrypt/0.4

## How to run this project
Run this command in your terminal:
```
javac -cp lib/jbcrypt-0.4.jar UserInput.java
java -cp .:lib/jbcrypt-0.4.jar UserInput
```
