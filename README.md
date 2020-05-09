## Configuring H2 Database With Spring Boot

###Sources used

* [Spring Initializr](https://start.spring.io/)
* [howtodoinjava.com](https://howtodoinjava.com/spring-boot2/h2-database-example/)
* [stackabuse.com](https://stackabuse.com/integrating-h2-database-with-spring-boot/)

###Steps:

#####1.Use Spring Initializr to configure the project build and name, then add the corresponding dependencies (H2 Database, Spring Data JPA, Spring Web)
#####2.Configure H2 database in application.properties:
```spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
```
#####3.Enable h2 console:
```
spring.h2.console.enabled=true
spring.h2.console.path=/h2
```
#####4. Create needed entities, repository, service and controller, within the gradle java project
#####5.Create schema.sql and data.sql
schema.sql
```
DROP TABLE IF EXISTS TBL_EMPLOYEES;
  
CREATE TABLE TBL_EMPLOYEES (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  email VARCHAR(250) DEFAULT NULL
);
```
data.sql
```
INSERT INTO TBL_EMPLOYEES (first_name, last_name, email) VALUES
  ('Iron', 'Man', 'redandgold@imrich.com'),
  ('Black', 'Panther', 'wakanda4life@gmail.com'),
  ('Captain', 'America', 'cap@marvel.com');
```
#####6.Build project and Run main()
#####7.Finally, you can use Postman to test your endpoints
For example, adding a person to the database:
#####Request type: POST
#####URL:  http://localhost:8080/persons
#####Request Header: Content-Type:application/json
```
{"name":"test", "age":27, "emailId": "test@thisdatabase.com"}
```
You can then use GET to show your newly added person.