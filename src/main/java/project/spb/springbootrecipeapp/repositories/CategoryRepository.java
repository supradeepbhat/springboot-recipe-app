package project.spb.springbootrecipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import project.spb.springbootrecipeapp.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
