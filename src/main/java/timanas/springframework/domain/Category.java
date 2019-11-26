package timanas.springframework.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by timmanas on 2019-11-26.
 */
@Data
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

}