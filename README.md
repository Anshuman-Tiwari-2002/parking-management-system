# Parking Management System

A Java Swing based Parking Management System developed using JDBC and MySQL for managing vehicle parking, parking spaces, employees, and billing operations.

## Features

### Authentication

* Employee Login
* Admin Login
* User Registration

### Parking Management

* Add Parking Spaces
* View Available Parking Spaces
* Park Vehicles
* Search Vehicle by Ticket Number or RC Number
* Vehicle Exit Processing
* Receipt Generation

### Employee Management

* Add Employees
* Remove Employees
* Employee Authentication

### Vehicle Records

* View Currently Parked Vehicles
* View Vehicle Parking History
* Maintain Entry and Exit Logs

---

## Technology Stack

### Frontend

* Java Swing

### Backend

* Java
* JDBC

### Database

* MySQL 8.x

### Build Tool

* Maven

### IDE

* VS Code

---

## Project Structure

```text
signup/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/mycompany/signup/
│   │   └── resources/
│   │       └── images/
│
├── schema.sql
├── database.sql
├── pom.xml
└── README.md
```

---

## Database Tables

### login

Stores employee and admin login credentials.

| Column   | Type    |
| -------- | ------- |
| uname    | varchar |
| password | varchar |

### signup

Stores registered user details.

| Column   | Type    |
| -------- | ------- |
| id       | int     |
| fname    | varchar |
| lname    | varchar |
| uname    | varchar |
| passwd   | varchar |
| confpass | varchar |
| phno     | varchar |

### employee

Stores employee information.

| Column    | Type    |
| --------- | ------- |
| id        | int     |
| emp_name  | varchar |
| user_name | varchar |
| password  | varchar |

### park_space

Stores parking area information.

| Column      | Type    |
| ----------- | ------- |
| id          | int     |
| space_name  | varchar |
| total_space | int     |

### vehicle_details

Stores currently parked vehicles.

| Column    | Type    |
| --------- | ------- |
| ticket_no | int     |
| rc_no     | varchar |
| full_name | varchar |
| plot      | varchar |
| atime     | varchar |
| plot_name | varchar |

### all_vehicle

Stores vehicle history.

| Column | Type    |
| ------ | ------- |
| id     | int     |
| rc_no  | varchar |
| atime  | varchar |
| dtime  | varchar |
| name   | varchar |
| rate   | int     |

---

## Database Setup

### Create Database

```sql
CREATE DATABASE DBMS;
```

### Import Schema

```bash
mysql -u root -p DBMS < schema.sql
```

### Import Sample Data

```bash
mysql -u root -p DBMS < database.sql
```

---

## Build Project

```bash
mvn clean compile
```

---

## Run Project

```bash
mvn exec:java -Dexec.mainClass="com.mycompany.signup.login"
```

---

## Default Workflow

### Employee Flow

1. Login
2. Add Vehicle
3. Search Vehicle
4. Generate Receipt
5. Vehicle Exit

### Admin Flow

1. Login
2. Add Parking Space
3. Add Employee
4. Remove Employee
5. View Vehicle Records

---

## Screens Included

* Login Screen
* Registration Screen
* Admin Dashboard
* Add Parking Space
* Add Employee
* Remove Employee
* Add Vehicle
* Vehicle Billing
* Show Parking Spaces
* View All Vehicles

---

## Future Improvements

* Password Hashing
* Role Based Access Control
* PDF Receipt Generation
* Printing Support
* Better UI Design
* Dashboard Analytics
* Online Database Hosting

---

## Author

Anshuman Tiwari

Developed as a Java Swing + MySQL Database Management System project.
