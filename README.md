# Password Management System

## Overview

This project is a Password Management System that allows users to securely store and manage their passwords for various accounts and services. The system includes functionalities such as password encryption, random password generation, and a user-friendly menu for interacting with the application.

## Credits
-Ciril Biju Joseph (Project Manager)
-Amil Shahul   (Technical Lead)
-Mit Damniwala (Documentation Lead)

## Features

- **User Registration and Login:** Users can register new accounts and log in to the system.
- **Password Encryption:** All passwords are encrypted using AES encryption.
- **Random Password Generation:** Users can generate strong and complex passwords.
- **Password Management:** Users can add, view, delete, and update their stored passwords.
- **Menu-Driven Interface:** A simple menu interface for easy navigation.

## Files

### `App.java`

The main entry point of the application. It initializes the connection to the database and starts the application.

### `encryption.java`

Handles the encryption and decryption of passwords using the AES algorithm.

### `Menu.java`

Provides a menu-driven interface for users to interact with the password manager. Users can add new websites and passwords, generate random passwords, view all stored passwords, delete passwords, and change their user information.

### `RandomPasswordGenerator.java`

Generates strong and complex random passwords using a combination of uppercase letters, lowercase letters, digits, and special characters.

### `User.java`

Manages user information, including registration and login functionality. It interacts with the database to store and retrieve user data.

## Usage

1. **Clone the repository:**
    ```sh
    git clone <repository_url>
    ```

2. **Navigate to the project directory:**
    ```sh
    cd PasswordManagementSystem
    ```

3. **Compile the Java files:**
    ```sh
    javac *.java
    ```

4. **Run the application:**
    ```sh
    java App
    ```

## Database Setup

Ensure you have a MySQL database running and update the database connection details in the `App.java` file:
```java
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "YOURPASSWORD");


