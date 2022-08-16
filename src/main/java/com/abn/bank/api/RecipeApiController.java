package com.abn.bank.api;

import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.Generated;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.NativeWebRequest;

import com.abn.bank.model.Recipe;
import com.abn.bank.model.RecipeCreate;
import com.abn.bank.model.RecipeUpdate;
import com.abn.bank.queryspec.RecipeSpecificationBuilder;
import com.abn.bank.service.RecipeSerive;
import com.abn.bank.util.Helper;

import io.swagger.v3.oas.annotations.Parameter;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-08-13T14:56:10.962717300+05:30[Asia/Calcutta]")
@Controller
@RequestMapping("${openapi.recipeManagement.base-path:/abn-api/recipeManagement/v4}")
public class RecipeApiController implements RecipeApi {

	private final NativeWebRequest request;

	@Autowired
	public RecipeApiController(NativeWebRequest request) {
		this.request = request;
	}

	@Override
	public Optional<NativeWebRequest> getRequest() {
		return Optional.ofNullable(request);
	}

	@Autowired
	private RecipeSerive recipeService;

	public ResponseEntity<Recipe> retrieveRecipe(
			@Parameter(name = "id", description = "Identifier of the Recipe", required = true) @PathVariable("id") Object id,
			@Parameter(name = "fields", description = "Comma-separated properties to provide in response") @Valid @RequestParam(value = "fields", required = false) String fields) {
		Recipe recipe = recipeService.getRecipeById(Long.parseLong(id.toString()));
		return new ResponseEntity<Recipe>(recipe, HttpStatus.OK);
	}

	public ResponseEntity<Recipe> createRecipe(
			@Parameter(name = "recipe", description = "The Recipe to be created", required = true) @Valid @RequestBody RecipeCreate recipe) {
		Recipe newRecipe = new Recipe();
		newRecipe.setIngredient(recipe.getIngredient());
		newRecipe.setIngredientsType(recipe.getIngredients());
		newRecipe.setInstructions(recipe.getInstructions());
		newRecipe.setName(recipe.getName());
		newRecipe.setServings(recipe.getServings());
		newRecipe.setVegetarian(recipe.getVegetarian());
		Recipe createRecipe = recipeService.createRecipe(newRecipe);
		return new ResponseEntity<Recipe>(createRecipe, HttpStatus.OK);
	}

	public ResponseEntity<Void> deleteRecipe(
			@Parameter(name = "id", description = "Identifier of the Recipe", required = true) @PathVariable("id") Object id) {
		recipeService.deleteRecipe(Long.parseLong(id.toString()));
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	public ResponseEntity<List<Recipe>> listRecipe(
			@Parameter(name = "fields", description = "Comma-separated properties to be provided in response") @Valid @RequestParam(value = "fields", required = false) String fields,
			@Parameter(name = "offset", description = "Requested index for start of resources to be provided in response") @Valid @RequestParam(value = "offset", required = false) Integer offset,
			@Parameter(name = "limit", description = "Requested number of resources to be provided in response") @Valid @RequestParam(value = "limit", required = false) Integer limit) {
		Specification<Recipe> spec = null;
		if (!(fields == null || fields.isEmpty() || fields.trim().isEmpty())) {
			spec = Helper.buildQuery(fields);
		}
		List<Recipe> listRecipe = recipeService.getAllRecipes(spec);
		return new ResponseEntity<List<Recipe>>(listRecipe, HttpStatus.OK);
	}

	public ResponseEntity<Recipe> patchRecipe(
			@Parameter(name = "id", description = "Identifier of the Recipe", required = true) @PathVariable("id") Object id,
			@Parameter(name = "recipe", description = "The Recipe to be updated", required = true) @Valid @RequestBody RecipeUpdate recipe) {
		Recipe newRecipe = new Recipe();
		newRecipe.setIngredient(recipe.getIngredient());
		newRecipe.setIngredientsType(recipe.getIngredients());
		newRecipe.setInstructions(recipe.getInstructions());
		newRecipe.setName(recipe.getName());
		newRecipe.setServings(recipe.getServings());
		newRecipe.setVegetarian(recipe.getVegetarian());
		Recipe updatedRecipe = recipeService.updateRecipe(Long.parseLong(id.toString()), newRecipe);
		return new ResponseEntity<Recipe>(updatedRecipe, HttpStatus.OK);
	}
}
