package it.scuccimarri.repositories;

import it.scuccimarri.model.*;
import org.springframework.data.repository.*;

/**
 * Created by jt on 6/13/17.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}