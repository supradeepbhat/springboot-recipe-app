package project.spb.springbootrecipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import project.spb.springbootrecipeapp.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
