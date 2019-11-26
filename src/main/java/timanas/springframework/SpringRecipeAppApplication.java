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


 Question:
 Why is id a generated value ?
 What is id used for ?

 */