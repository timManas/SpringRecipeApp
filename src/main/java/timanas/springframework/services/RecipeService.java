package timanas.springframework.services;

import timanas.springframework.commands.RecipeCommand;
import timanas.springframework.domain.Recipe;

import java.util.Set;

/**
 * Created by timmanas on 2019-11-26.
 */
public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}