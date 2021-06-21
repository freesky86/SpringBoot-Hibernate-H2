# SpringBoot-Hibernate-H2
SpringBoot connect H2 database with Hibernate

1. How to use H2?
refer to  https://www.h2database.com/html/quickstart.html
In this project, we add h2 dependency in pom.xml
		<dependency>
		    <groupId>com.h2database</groupId>
		    <artifactId>h2</artifactId>
		    <scope>runtime</scope>
		</dependency>
so there is a h2-xxx.jar.
when Spring Boot start up, the h2 database is also started.
we can access http://localhost:8080/h2-console/ to connect h2 database.

2. About this project
this is a demo to show how to connect H2 using hibernate
refer to https://www.baeldung.com/spring-boot-hibernate

