package project.spb.springbootrecipeapp.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class CategoryTest {

    private Category category;

    @Before
    public void setUp(){
        category = new Category();
    }

    @Test
    public void getId() {
        Long categoryId = 23L;
        category.setId(categoryId);

        assertEquals(categoryId, category.getId());
    }

    @Test
    public void getDescription() {
        String description = "This is a sample category description";
        category.setDescription(description);

        assertEquals(description, category.getDescription());
    }

    @Test
    public void getRecipes() {
        Recipe sampleRecipe = new Recipe();
        Set<Recipe> recipes = new HashSet<>();
        recipes.add(sampleRecipe);
        category.setRecipes(recipes);


    }
}