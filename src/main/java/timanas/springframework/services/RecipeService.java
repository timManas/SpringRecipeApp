package timanas.springframework.services;

import timanas.springframework.domain.Recipe;

import java.util.Set;

/**
 * Created by timmanas on 2019-11-26.
 */
public interface RecipeService {
    Set<Recipe> getRecipes();
}
