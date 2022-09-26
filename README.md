# Cinema-App

This project provide simple example how to create WEB Application using **Java Spring**,
**Java Hibernate**, **JDBC** and **MySQL** as relation database.
The basic functionality provide most common operations with simple objects 
such as Cinema Hall, Movie, Ticket, User, Shopping Cart, Order.  REST API, and Basic Authentication 
allow use this application like endpoint third party applications for managing simple Cinema service. 


## Project overview
### Tchnologies
- Java EE 11
- Java Hibernate
- Java Spring
- REST API
- MySQL
- Maven
- JDBC

### Database architecture
<p align="center"><img src="Hibernate_Cinema_Uml.png"></p>

### Installation process
 - Install IntelliJ IDEA (Ultimate Edition) with maven
 - Create new project, use menu File -> New -> Project from Version Control copy past 
 - and insert git url [https://github.com/vitaliyzahorenko/cinema-web-app]
 - Install MySQL and create empty database 
 - Edit configuration in resources/db.properties file.
 - Install Apache Tomcat 9.0.65
 - Add Tomcat to Run/Debug configuration of project

### REST API CURL EXAMPLE
   Here is example how to use basic authentication with curl

   User registration: 
    
    curl -u '[admin_email]:[admin_password]' -X POST http://[cinema-web-app-url]/register/  -H 'Content-Type: application/json'  -d '{"email":"[useremail]","password":"[password]","repeatPassword":"[password]"}'

   Get movies list:

        curl -u '[user_email]:[user_password]' -X POST http://[cinema-web-app-url]/movies/  -H 'Content-Type: application/json'

   EXAMPLE URL: http://examples.mooo.com:8080