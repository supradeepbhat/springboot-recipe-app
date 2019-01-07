package project.spb.springbootrecipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import project.spb.springbootrecipeapp.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
