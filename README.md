# SpringBoot-Hibernate-H2
SpringBoot connect H2 database with Hibernate

1. Overview

This project shows you how to connect H2 database with Hibernate.
After you run MyApplication.java, Spring Boot will start up and meanwhile H2 database will also start.
It will create Book tale according to @Entity annotation automatically and run import.sql under sr/main/resources folder to insert data automatically.
Then when you access http://localhost:8080/books, it will display the 3 records in H2 database.

2. How to use H2?

Refer to  https://www.h2database.com/html/quickstart.html

In this project, we add h2 dependency in pom.xml
		<dependency>
		    <groupId>com.h2database</groupId>
		    <artifactId>h2</artifactId>
		    <scope>runtime</scope>
		</dependency>
so there is a h2-xxx.jar.
when Spring Boot start up, the h2 database is also started.

I add h2 jdbc url in application.properties
spring.datasource.url=jdbc:h2:mem:test;DB_CLOSE_DELAY=-1
Without this item, it will generate a random string as h2 database name when h2 start.
When Spring Boot start, you can refer to the log on console to find the h2 database name generated.
	H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:381728cb-3c1f-434b-bcb9-d45f76bbe0a1'
we can access http://localhost:8080/h2-console/ to connect h2 database.

3. About this project

this is a demo to show how to connect H2 using hibernate
refer to https://www.baeldung.com/spring-boot-hibernate

For H2 usage, we only need two packages
	com.example.domain
	com.example.service
you can consult BookController.java to see how to access H2 database.
Here are two examples
http://localhost:8080/books
http://localhost:8080/findBook

4. Contact Me

Email: freesky_zh@hotmail.com
