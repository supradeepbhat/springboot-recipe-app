package project.spb.springbootrecipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import project.spb.springbootrecipeapp.domain.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

     Optional<UnitOfMeasure> findByDescription(String description);
}
