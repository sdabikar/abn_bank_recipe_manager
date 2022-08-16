package com.abn.bank.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Recipe Object
 */
@Entity
@Table(name = "RECIPE")
@Schema(name = "Recipe", description = "Recipe Object")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-08-15T15:39:51.697784200+05:30[Asia/Calcutta]")
public class Recipe {
	@JsonProperty("name")
	  private String name;
      
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  @JsonProperty("id")
	  private Long id;

	  @JsonProperty("vegetarian")
	  private String vegetarian;

	  @JsonProperty("servings")
	  private Integer servings;

	  @JsonProperty("instructions")
	  private String instructions;

	  @JsonProperty("ingredient")
	  private String ingredient;

	  @JsonProperty("ingredientsType")
	  @Valid
	  @ManyToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
	  @JoinColumn(name="id")
	  private List<IngredientsType> ingredientsType = null;

	  public Recipe name(String name) {
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

	  public Recipe id(Long id) {
	    this.id = id;
	    return this;
	  }

	  /**
	   * ID of the Recipe
	   * @return id
	  */
	  @NotNull 
	  @Schema(name = "id", description = "ID of the Recipe", required = true)
	  public Long getId() {
	    return id;
	  }

	  public void setId(Long id) {
	    this.id = id;
	  }

	  public Recipe vegetarian(String vegetarian) {
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

	  public Recipe servings(Integer servings) {
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

	  public Recipe instructions(String instructions) {
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

	  public Recipe ingredient(String ingredient) {
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

	  public Recipe ingredientsType(List<IngredientsType> ingredientsType) {
	    this.ingredientsType = ingredientsType;
	    return this;
	  }

	  public Recipe addIngredientsTypeItem(IngredientsType ingredientsTypeItem) {
	    if (this.ingredientsType == null) {
	      this.ingredientsType = new ArrayList<>();
	    }
	    this.ingredientsType.add(ingredientsTypeItem);
	    return this;
	  }

	  /**
	   * Get ingredientsType
	   * @return ingredientsType
	  */
	  @Valid 
	  @Schema(name = "ingredientsType", required = false)
	  public List<IngredientsType> getIngredientsType() {
	    return ingredientsType;
	  }

	  public void setIngredientsType(List<IngredientsType> ingredientsType) {
	    this.ingredientsType = ingredientsType;
	  }

	  @Override
	  public boolean equals(Object o) {
	    if (this == o) {
	      return true;
	    }
	    if (o == null || getClass() != o.getClass()) {
	      return false;
	    }
	    Recipe recipe = (Recipe) o;
	    return Objects.equals(this.name, recipe.name) &&
	        Objects.equals(this.id, recipe.id) &&
	        Objects.equals(this.vegetarian, recipe.vegetarian) &&
	        Objects.equals(this.servings, recipe.servings) &&
	        Objects.equals(this.instructions, recipe.instructions) &&
	        Objects.equals(this.ingredient, recipe.ingredient) &&
	        Objects.equals(this.ingredientsType, recipe.ingredientsType);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(name, id, vegetarian, servings, instructions, ingredient, ingredientsType);
	  }

	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class Recipe {\n");
	    sb.append("    name: ").append(toIndentedString(name)).append("\n");
	    sb.append("    id: ").append(toIndentedString(id)).append("\n");
	    sb.append("    vegetarian: ").append(toIndentedString(vegetarian)).append("\n");
	    sb.append("    servings: ").append(toIndentedString(servings)).append("\n");
	    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
	    sb.append("    ingredient: ").append(toIndentedString(ingredient)).append("\n");
	    sb.append("    ingredientsType: ").append(toIndentedString(ingredientsType)).append("\n");
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

