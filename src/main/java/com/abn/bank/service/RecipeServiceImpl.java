package com.abn.bank.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.abn.bank.model.Recipe;
import com.abn.bank.repo.RecipeRepository;

@Service
public class RecipeServiceImpl implements RecipeSerive {
    
	@Autowired
	private RecipeRepository repository;
	
	@Override
	public void deleteRecipe(Long Id) {
		repository.deleteById(Id);
	}

	@Override
	public Recipe updateRecipe(Long Id, Recipe recipe) {
		Recipe oldRecipe = getRecipeById(Id);
		Recipe newRecipe = oldRecipe;
		newRecipe.setIngredient(recipe.getIngredient());
		newRecipe.setIngredientsType(recipe.getIngredientsType());
		newRecipe.setInstructions(recipe.getInstructions());
		newRecipe.setName(recipe.getName());
		newRecipe.setServings(recipe.getServings());
		newRecipe.setVegetarian(recipe.getVegetarian());
		return createRecipe(newRecipe);
	}

	@Override
	public Recipe getRecipeById(Long Id) {
		Optional<Recipe> recipe = repository.findById(Id);
		return recipe.get();
	}

	@Override
	public List<Recipe> getAllRecipes(Specification<Recipe> spec) {
		Iterable<Recipe> recipe = repository.findAll(spec);
		List<Recipe> actualList = new ArrayList<Recipe>();
		recipe.forEach(item->{
			actualList.add(item);
		});
		return actualList;
	}

	@Override
	public Recipe createRecipe(Recipe recipe) {
		return repository.save(recipe);
	}

}
