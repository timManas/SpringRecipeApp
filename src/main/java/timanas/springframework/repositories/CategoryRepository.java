package timanas.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import timanas.springframework.domain.Category;

import java.util.Optional;

/**
 * Created by timmanas on 2019-11-26.
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> findByDescription(String description);
}
