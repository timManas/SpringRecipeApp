package timanas.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import timanas.springframework.domain.UnitOfMeasure;

import java.util.Optional;

/**
 * Created by timmanas on 2019-11-26.
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}