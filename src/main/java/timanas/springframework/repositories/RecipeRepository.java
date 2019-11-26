package timanas.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import timanas.springframework.domain.Recipe;

/**
 * Created by timmanas on 2019-11-26.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
