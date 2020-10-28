package it.scuccimarri.repositories;

import it.scuccimarri.model.*;
import org.springframework.data.repository.*;

import java.util.*;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
