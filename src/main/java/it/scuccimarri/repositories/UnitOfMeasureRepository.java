package it.scuccimarri.repositories;

import it.scuccimarri.model.*;
import org.springframework.data.repository.*;

import java.util.*;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
