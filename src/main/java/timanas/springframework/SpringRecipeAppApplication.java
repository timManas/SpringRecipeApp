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

 Question:
 Why is id a generated value ?
 What is id used for ?

 */