package com.abn.bank.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.List;
import com.abn.bank.model.IngredientsType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Recipe Object
 */

@Schema(name = "Recipe_Create", description = "Recipe Object")
@JsonTypeName("Recipe_Create")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-08-15T15:39:51.697784200+05:30[Asia/Calcutta]")
public class RecipeCreate {
	@JsonProperty("ingredient")
	  private String ingredient;

	  @JsonProperty("name")
	  private String name;

	  @JsonProperty("id")
	  private Long id;

	  @JsonProperty("vegetarian")
	  private String vegetarian;

	  @JsonProperty("servings")
	  private Integer servings;

	  @JsonProperty("instructions")
	  private String instructions;

	  @JsonProperty("ingredients")
	  @Valid
	  private List<IngredientsType> ingredients = new ArrayList<>();

	  public RecipeCreate ingredient(String ingredient) {
	    this.ingredient = ingredient;
	    return this;
	  }

	  /**
	   * Main ingredient for Preparing Recipe
	   * @return ingredient
	  */
	  
	  @Schema(name = "ingredient", description = "Main ingredient for Preparing Recipe", required = false)
	  public String getIngredient() {
	    return ingredient;
	  }

	  public void setIngredient(String ingredient) {
	    this.ingredient = ingredient;
	  }

	  public RecipeCreate name(String name) {
	    this.name = name;
	    return this;
	  }

	  /**
	   * Name of the Recipe
	   * @return name
	  */
	  @NotNull 
	  @Schema(name = "name", description = "Name of the Recipe", required = true)
	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public RecipeCreate id(Long id) {
	    this.id = id;
	    return this;
	  }

	  /**
	   * ID of the Recipe
	   * @return id
	  */
	  
	  @Schema(name = "id", description = "ID of the Recipe", required = false)
	  public Long getId() {
	    return id;
	  }

	  public void setId(Long id) {
	    this.id = id;
	  }

	  public RecipeCreate vegetarian(String vegetarian) {
	    this.vegetarian = vegetarian;
	    return this;
	  }

	  /**
	   * Recipe veg or non-veg
	   * @return vegetarian
	  */
	  @NotNull 
	  @Schema(name = "vegetarian", description = "Recipe veg or non-veg", required = true)
	  public String getVegetarian() {
	    return vegetarian;
	  }

	  public void setVegetarian(String vegetarian) {
	    this.vegetarian = vegetarian;
	  }

	  public RecipeCreate servings(Integer servings) {
	    this.servings = servings;
	    return this;
	  }

	  /**
	   * Recipe Servers for No of People
	   * @return servings
	  */
	  @NotNull 
	  @Schema(name = "servings", description = "Recipe Servers for No of People", required = true)
	  public Integer getServings() {
	    return servings;
	  }

	  public void setServings(Integer servings) {
	    this.servings = servings;
	  }

	  public RecipeCreate instructions(String instructions) {
	    this.instructions = instructions;
	    return this;
	  }

	  /**
	   * Instructions for Preparing Recipe
	   * @return instructions
	  */
	  @NotNull 
	  @Schema(name = "instructions", description = "Instructions for Preparing Recipe", required = true)
	  public String getInstructions() {
	    return instructions;
	  }

	  public void setInstructions(String instructions) {
	    this.instructions = instructions;
	  }

	  public RecipeCreate ingredients(List<IngredientsType> ingredients) {
	    this.ingredients = ingredients;
	    return this;
	  }

	  public RecipeCreate addIngredientsItem(IngredientsType ingredientsItem) {
	    this.ingredients.add(ingredientsItem);
	    return this;
	  }

	  /**
	   * Get ingredients
	   * @return ingredients
	  */
	  @NotNull @Valid 
	  @Schema(name = "ingredients", required = true)
	  public List<IngredientsType> getIngredients() {
	    return ingredients;
	  }

	  public void setIngredients(List<IngredientsType> ingredients) {
	    this.ingredients = ingredients;
	  }

	  @Override
	  public boolean equals(Object o) {
	    if (this == o) {
	      return true;
	    }
	    if (o == null || getClass() != o.getClass()) {
	      return false;
	    }
	    RecipeCreate recipeCreate = (RecipeCreate) o;
	    return Objects.equals(this.ingredient, recipeCreate.ingredient) &&
	        Objects.equals(this.name, recipeCreate.name) &&
	        Objects.equals(this.id, recipeCreate.id) &&
	        Objects.equals(this.vegetarian, recipeCreate.vegetarian) &&
	        Objects.equals(this.servings, recipeCreate.servings) &&
	        Objects.equals(this.instructions, recipeCreate.instructions) &&
	        Objects.equals(this.ingredients, recipeCreate.ingredients);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(ingredient, name, id, vegetarian, servings, instructions, ingredients);
	  }

	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class RecipeCreate {\n");
	    sb.append("    ingredient: ").append(toIndentedString(ingredient)).append("\n");
	    sb.append("    name: ").append(toIndentedString(name)).append("\n");
	    sb.append("    id: ").append(toIndentedString(id)).append("\n");
	    sb.append("    vegetarian: ").append(toIndentedString(vegetarian)).append("\n");
	    sb.append("    servings: ").append(toIndentedString(servings)).append("\n");
	    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
	    sb.append("    ingredients: ").append(toIndentedString(ingredients)).append("\n");
	    sb.append("}");
	    return sb.toString();
	  }

	  /**
	   * Convert the given object to string with each line indented by 4 spaces
	   * (except the first line).
	   */
	  private String toIndentedString(Object o) {
	    if (o == null) {
	      return "null";
	    }
	    return o.toString().replace("\n", "\n    ");
	  }

  }

