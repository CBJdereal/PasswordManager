# Password Management Software

## Team Members
- **Amil Shahul** (Tech Lead): Led the technical aspects of the project, ensuring the software's functionality and security.
- **Mit Damniwala** (Documentation Lead): Was responsible for overseeing the creation and maintenance of project documentation.
- **Ciril Biju Joseph** (Project Manager): Managed the overall project, coordinating between team members and ensuring timely completion.

## Introduction
In today's digital era, managing passwords securely had become more crucial than ever. Our Password Management Software was designed to tackle this challenge head-on, providing users with a robust solution for creating, storing, and managing their passwords efficiently.

## Why Password Management Matters
Weak or reused passwords can lead to severe consequences, including identity theft and data breaches. Effective password management was not just a convenience but a necessity, ensuring that users' online identities and sensitive information remained protected from unauthorized access.

## Project Scope
### Objectives
- **Enhance Security**: Provided users with a secure platform to store and manage their passwords, utilizing advanced encryption techniques.
- **Improve Convenience**: Simplified the process of managing multiple passwords, allowing users to access their credentials with ease.
- **Increase Efficiency**: Streamlined the process of creating, updating, and retrieving passwords, saving users time and effort.

### Target Audience
- **Individual Users**: People looking for a reliable solution to manage their personal passwords and secure their online presence.
- **Small to Medium Businesses (SMBs)**: Organizations in need of a centralized password management system to safeguard their company's sensitive information.

### Key Features
- **Add Credentials**: Allowed users to add a website's username and password to the database for secure storage.
- **View Credentials**: Users could view all stored websites and usernames in the database for easy access.
- **Delete Credentials**: Provided the option to delete a website's username and password from the database, ensuring users could manage their stored information.
- **Update Username**: Users could change the username associated with a website, maintaining up-to-date information.
- **Update Password**: Allowed users to change a website's password, ensuring strong and current security measures.
- **Delete User Account**: Users had the option to delete their user account, which removed all saved usernames and passwords from the system.

## Requirements
### Functional Requirements
- **Secure storage**: Encrypted and stored passwords safely.
- **Login authentication**: Ensured only authorized users accessed the manager.
- **Password retrieval**: Retrieved passwords upon user request.
- **Password update**: Allowed users to update stored passwords.

### Non-functional Requirements
- **Usability**: Intuitive graphical user interface for ease of use.
- **Performance**: Fast response times for storing and retrieving passwords.
- **Scalability**: Ability to handle an increasing number of users and passwords.
- **Security**: High-level encryption and security measures to protect data.

## Constraints
### Technological Constraints
- **Programming Language**: Java
- **Database**: SQL for storing user and password information
- **Encryption**: Advanced Encryption Standard

### Time and Resource Constraints
- **Project duration**: 42 days
- **Team size**: 3 group members

## Architectural Design
### High-level Architecture
- **Client-Server Model**: The system operated on a client-server model where the client application communicated with a server hosting a centralized database.
- **Layered Architecture**: Comprised three main layers:
  - **Presentation Layer**: The user interface for interaction.
  - **Logic Layer**: Core functionality and logic for password management.
  - **Data Access Layer**: Handled communication with the database for data storage and retrieval.

### Key Components
- **User Interface**: Provided a seamless and intuitive interface for users to interact with the password manager.
- **Encryption Module**: Utilized advanced encryption algorithms to ensure the security of stored passwords.
- **Database Manager**: Managed the storage, retrieval, and organization of password data within the database.

## Detailed Design
### UML Diagram
![UML Diagram](https://github.com/CBJdereal/PasswordManager/assets/64748236/976774f6-9dfe-4fa8-966b-338a688bdbdf)

### Sequence Diagram (App.java)
![Sequence Diagram](https://github.com/CBJdereal/PasswordManager/assets/64748236/41f41b01-6632-4980-bdec-1f8dcce63b62)

### Main Class (App)
- The `App` class contained the main method, which was the entry point of the program.
- It created an instance of the `App` class and called the `createConnection` method to establish a connection with the MySQL database and start the application.

### Creating a Database Connection (createConnection)
- The `createConnection` method initialized a connection to the MySQL database using JDBC (Java Database Connectivity).
- It checked if the `versions` table existed in the database to determine if the database had been initialized. If not, it initialized the database.
- It prompted the user to indicate whether they were a new user or an existing user. Based on the input, it either registered a new user or logged in an existing user.
- After successful login or registration, it created an instance of the `Menu` class to display the menu options to the user and allowed them to interact with the password manager.

### User Class
- The `User` class represented a user in the password management system. It had attributes for the username, password, and user ID.
- It provided static methods `registerNewUser` and `login` for user registration and login, respectively.
- The `registerNewUser` method prompted the user for a username and password, checked if the username was already taken, and inserted the new user into the database.
- The `login` method prompted the user for their username and password, verified the credentials against the database, and returned a `User` object if the login was successful.

### Menu Class
- The `Menu` class provided the user interface for interacting with the password management system.
- It displayed a menu with options to add a website, print all websites, delete a website, change a username, change a password, delete the user account, or quit the application.
- It had methods for each menu option, such as `addWebsite`, `printAllWebsites`, `deleteWebsite`, `changeWebsiteName`, `changePassword`, and `deleteUser`.
- These methods interacted with the database to perform the respective operations, such as adding a new website and password, retrieving all stored websites, updating or deleting records, etc.

### Database Interaction
- The program used SQL queries to interact with the MySQL database. It used `PreparedStatement` objects to execute SQL queries with parameters.
- The `website_data` table stored information about websites and passwords, and the `passwords` table linked users to their stored website data.
- The program checked for existing data, inserted new records, updated existing records, and deleted records as needed based on the user's actions.

## Testing
### Primary Use Cases
#### Adding a New User
- This Case below shows adding a new user (shows that a duplicate user cannot be added to the server so each and everyone has a unique username and password), Also shows adding of Three websites and password to the server. (YouTube, Google and Netflix).
There are 7 possible steps a user could take when a user is logged in :-
![image](https://github.com/CBJdereal/PasswordManager/assets/64748236/927081f0-08c9-4293-a99a-3d8fb812f001)

#### Deleting a Website
- Demonstrated the functionality of deleting the website named Netflix.
![image](https://github.com/CBJdereal/PasswordManager/assets/64748236/7a41e17c-a40b-4fb4-aeb3-336ff0b0c8f1)


#### Changing a Username for a Website
- Demonstrated the functionality of changing a username for a website.
![image](https://github.com/CBJdereal/PasswordManager/assets/64748236/74dacee3-9bc8-4c75-9cfe-230bd9b6fbbf)


#### Changing a Password for a Website
- Showed the use of changing a password for a website and printed all the websites at the end.
![image](https://github.com/CBJdereal/PasswordManager/assets/64748236/fb17c5eb-8e5b-4459-92c0-cc339afc650e)

#### Deleting a User
- Demonstrated the functionality of deleting a user, which deleted the entire account and all associated usernames and passwords.
![image](https://github.com/CBJdereal/PasswordManager/assets/64748236/627b6484-78c0-4a79-8e41-c14f8ad378b5)


### Secondary Use Cases
- The database functionality connected to the password management system.
- Showed all tables available in the database and the table for passwords containing user and website information.
![image](https://github.com/CBJdereal/PasswordManager/assets/64748236/52dea58d-e4e4-4f44-989b-59e3886838d8)


- Showed the table of users containing the username and password of each user, and the website data containing the website name and the password for that website.
![image](https://github.com/CBJdereal/PasswordManager/assets/64748236/b812247e-a658-4269-948d-ce4a32ed2b1f)


### Graphical User Interface Test Cases
![image](https://github.com/CBJdereal/PasswordManager/assets/64748236/d6273f65-782e-4404-b875-3a818e9e559f)

![image](https://github.com/CBJdereal/PasswordManager/assets/64748236/96a161d9-65c4-476c-8aeb-e8574a476bac)

![image](https://github.com/CBJdereal/PasswordManager/assets/64748236/13349f38-8fb1-4c5a-98e6-0f1da6a546a2)

![image](https://github.com/CBJdereal/PasswordManager/assets/64748236/efa298af-83da-4a07-bc43-6c101cd12a12)

### Encryption
![image](https://github.com/CBJdereal/PasswordManager/assets/64748236/0200a791-c5b1-438f-9350-1cc9d5df3804)
![image](https://github.com/CBJdereal/PasswordManager/assets/64748236/2bfbd231-6e21-4c25-a1e7-4817300eef21)

### Random password generator
![WhatsApp Image 2024-04-04 at 23 31 00_a6387513](https://github.com/CBJdereal/PasswordManager/assets/64748236/62a3bf30-c4bf-4da1-a7e2-54754cdecf62)
![WhatsApp Image 2024-04-04 at 23 32 20_067c98ff](https://github.com/CBJdereal/PasswordManager/assets/64748236/63e58ae2-a017-4d05-adea-0b3123420219)
![WhatsApp Image 2024-04-04 at 23 31 14_dc736943](https://github.com/CBJdereal/PasswordManager/assets/64748236/e21d47dd-380a-4042-86b4-c8a505eaebb0)


## Conclusion
### Project Highlights
- The password manager provided secure and efficient management of passwords.
- Featured a user-friendly interface for easy navigation and interaction.
- Employed robust encryption techniques to ensure the security of stored data.

## Installation

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Git (optional, for cloning the repository)

### Steps to Install

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

