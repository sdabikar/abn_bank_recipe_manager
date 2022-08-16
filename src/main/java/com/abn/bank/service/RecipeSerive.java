package com.abn.bank.service;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import com.abn.bank.model.Recipe;

public interface RecipeSerive {
     public void deleteRecipe(Long Id);
     public Recipe updateRecipe(Long Id,Recipe recipe);
     public Recipe getRecipeById(Long Id);
     public List<Recipe> getAllRecipes(Specification<Recipe> spec);
     public Recipe createRecipe(Recipe recipe);
}
