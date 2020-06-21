package com.progrema.createrecipe.services;

import com.progrema.createrecipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

}
