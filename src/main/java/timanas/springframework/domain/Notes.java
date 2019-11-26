package timanas.springframework.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by timmanas on 2019-11-26.
 */
@Data
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;

}
