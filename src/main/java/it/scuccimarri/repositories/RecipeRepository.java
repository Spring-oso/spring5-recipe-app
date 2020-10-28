package it.scuccimarri.repositories;

import it.scuccimarri.model.*;
import org.springframework.data.repository.*;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
