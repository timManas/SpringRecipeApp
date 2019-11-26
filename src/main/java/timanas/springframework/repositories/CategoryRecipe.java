package timanas.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import timanas.springframework.domain.Category;

/**
 * Created by timmanas on 2019-11-26.
 */
public interface CategoryRecipe extends CrudRepository<Category, Long> {
}
