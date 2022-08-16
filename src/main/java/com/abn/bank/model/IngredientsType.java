package com.abn.bank.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Ingredients Object
 */
@Entity
@Table(name = "INGREDIENT")
@Schema(name = "IngredientsType", description = "Ingredients Object")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-08-15T15:39:51.697784200+05:30[Asia/Calcutta]")
public class IngredientsType {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("quantity")
  private Integer quantity;

  public IngredientsType id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the Ingredient
   * @return id
  */
  
  @Schema(name = "id", description = "ID of the Ingredient", required = false)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public IngredientsType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the Ingredient
   * @return name
  */
  
  @Schema(name = "name", description = "Name of the Ingredient", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IngredientsType quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Quantity in TableSpoon
   * @return quantity
  */
  
  @Schema(name = "quantity", description = "Quantity in TableSpoon", required = false)
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IngredientsType ingredientsType = (IngredientsType) o;
    return Objects.equals(this.id, ingredientsType.id) &&
        Objects.equals(this.name, ingredientsType.name) &&
        Objects.equals(this.quantity, ingredientsType.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IngredientsType {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

