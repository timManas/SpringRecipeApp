package timanas.springframework.services;

import org.springframework.stereotype.Service;
import timanas.springframework.domain.Recipe;
import timanas.springframework.repositories.RecipeRepository;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by timmanas on 2019-11-26.
 */
@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }
}
