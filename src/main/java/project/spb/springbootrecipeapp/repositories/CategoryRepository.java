package project.spb.springbootrecipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import project.spb.springbootrecipeapp.domain.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
