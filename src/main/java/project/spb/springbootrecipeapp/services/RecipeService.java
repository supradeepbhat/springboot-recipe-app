package project.spb.springbootrecipeapp.services;

import project.spb.springbootrecipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
