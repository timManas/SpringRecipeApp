package timanas.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRecipeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRecipeAppApplication.class, args);
	}

}


/**

 Notes:
 - Notes and Recipe share a One To One relationship
 - We literally SPECIFY in the annotation if we want OneToOne, OneToMany ...etc
 - We have to join the tables together to avoid duplicates in the category entity
 - data-h2.sql will be picked up by the Spring Boot to load this data into DB
 - Spring boot will load from schema-${platform}.sql and data-${platform}.sql
 - Remember - We are able to query entries in the database by using the
 Optional<xxxx> findByDescription(String description)
 - Think of the Controller as the Router which routes to the proper destination (UI view)

 Question:
 Why is id a generated value ?
 	- Value generated by the DB
 What is id used for ?
 	- Identifying the correlation between two objects in a DB
 What is the service used for ?
 	- We pass the Service implementation to the Controller which generates Thymeleaf report

 What is bootstrap for ?
 	- Not for UI =)
  	- It is the part which does the actual creation of Data into DB which gets used by the Service > Controller > Index > HTML

 How to add objects to UI ?
 - use model.addAttribute() or use. mode.AddObjects() so you can print those to the browser

 How to generate a jar file ?
 - Click on the package button on the Maven tab

 2. Jar file
 ex. spring-boot-web-0.0.1-SNAPSHOT.jar

 Execute this command:
 - docker build -t spring-boot-docker .
 - docker run -d -p 8080:8080 spring-boot-docker
 - Wait a couple mins
 - Check logs are working
 - Check webpage =)
 - Done

 How do you perform CRUD operations?
 1. Add Service
 2. Implement Service
 3. Add Action to Controller
 4. Invoke the View (html template) uisng thymeleaf

 */