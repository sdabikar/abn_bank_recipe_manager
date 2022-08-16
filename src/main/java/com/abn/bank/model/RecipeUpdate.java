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

@Schema(name = "Recipe_Update", description = "Recipe Object")
@JsonTypeName("Recipe_Update")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-08-15T15:39:51.697784200+05:30[Asia/Calcutta]")
public class RecipeUpdate {

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
	  private List<IngredientsType> ingredients = null;

	  public RecipeUpdate ingredient(String ingredient) {
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

	  public RecipeUpdate name(String name) {
	    this.name = name;
	    return this;
	  }

	  /**
	   * Name of the Recipe
	   * @return name
	  */
	  
	  @Schema(name = "name", description = "Name of the Recipe", required = false)
	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public RecipeUpdate id(Long id) {
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

	  public RecipeUpdate vegetarian(String vegetarian) {
	    this.vegetarian = vegetarian;
	    return this;
	  }

	  /**
	   * Recipe veg or non-veg
	   * @return vegetarian
	  */
	  
	  @Schema(name = "vegetarian", description = "Recipe veg or non-veg", required = false)
	  public String getVegetarian() {
	    return vegetarian;
	  }

	  public void setVegetarian(String vegetarian) {
	    this.vegetarian = vegetarian;
	  }

	  public RecipeUpdate servings(Integer servings) {
	    this.servings = servings;
	    return this;
	  }

	  /**
	   * Recipe Servers for No of People
	   * @return servings
	  */
	  
	  @Schema(name = "servings", description = "Recipe Servers for No of People", required = false)
	  public Integer getServings() {
	    return servings;
	  }

	  public void setServings(Integer servings) {
	    this.servings = servings;
	  }

	  public RecipeUpdate instructions(String instructions) {
	    this.instructions = instructions;
	    return this;
	  }

	  /**
	   * Instructions for Preparing Recipe
	   * @return instructions
	  */
	  
	  @Schema(name = "instructions", description = "Instructions for Preparing Recipe", required = false)
	  public String getInstructions() {
	    return instructions;
	  }

	  public void setInstructions(String instructions) {
	    this.instructions = instructions;
	  }

	  public RecipeUpdate ingredients(List<IngredientsType> ingredients) {
	    this.ingredients = ingredients;
	    return this;
	  }

	  public RecipeUpdate addIngredientsItem(IngredientsType ingredientsItem) {
	    if (this.ingredients == null) {
	      this.ingredients = new ArrayList<>();
	    }
	    this.ingredients.add(ingredientsItem);
	    return this;
	  }

	  /**
	   * Get ingredients
	   * @return ingredients
	  */
	  @Valid 
	  @Schema(name = "ingredients", required = false)
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
	    RecipeUpdate recipeUpdate = (RecipeUpdate) o;
	    return Objects.equals(this.ingredient, recipeUpdate.ingredient) &&
	        Objects.equals(this.name, recipeUpdate.name) &&
	        Objects.equals(this.id, recipeUpdate.id) &&
	        Objects.equals(this.vegetarian, recipeUpdate.vegetarian) &&
	        Objects.equals(this.servings, recipeUpdate.servings) &&
	        Objects.equals(this.instructions, recipeUpdate.instructions) &&
	        Objects.equals(this.ingredients, recipeUpdate.ingredients);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(ingredient, name, id, vegetarian, servings, instructions, ingredients);
	  }

	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class RecipeUpdate {\n");
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

