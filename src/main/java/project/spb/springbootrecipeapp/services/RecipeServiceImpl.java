package project.spb.springbootrecipeapp.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import project.spb.springbootrecipeapp.domain.Recipe;
import project.spb.springbootrecipeapp.repositories.RecipeRepository;

import java.util.HashSet;
import java.util.Set;

@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {

    private RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        log.debug("I'm in the service");

       Set<Recipe> recipes = new HashSet<>();
       recipeRepository.findAll().iterator().forEachRemaining(recipes::add);
       return recipes;
    }
}
