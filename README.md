# DBAPP Java Database Web Application

A Java web application developed using Servlets, PostgreSQL JDBC, and Apache Tomcat.

This project demonstrates database connectivity and backend processing using Java Servlets and PostgreSQL.

## Features
- Database connectivity using JDBC
- Servlet-based request handling
- Dynamic response generation
- PostgreSQL database integration
- Web application deployment using Tomcat

## Technologies Used
- Java
- JDBC
- PostgreSQL
- Servlet API
- Apache Tomcat
- HTML5

## Project Structure

DBAPP/
│
├── details.html
│
└── WEB-INF/
     ├── classes/
     │    └── DBSrv.java
     │
     ├── lib/
     │    └── postgresql-42.7.10.jar
     │
     └── web.xml

## How to Run

1. Install Apache Tomcat
2. Install PostgreSQL
3. Configure database connection inside the servlet
4. Copy the project folder into the Tomcat `webapps` directory
5. Start Tomcat server
6. Open the application in browser

Example:

http://localhost:8080/DBAPP

## Learning Outcomes
- JDBC database connectivity
- PostgreSQL integration
- Servlet lifecycle and request handling
- Web application deployment using Tomcat
- Dynamic backend processing using Java

## Author
Jigyasu Kumar
KIIT CSE 2027
