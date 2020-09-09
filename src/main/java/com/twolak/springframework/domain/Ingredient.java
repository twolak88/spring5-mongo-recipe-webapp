/**
 * 
 */
package com.twolak.springframework.domain;

import java.math.BigDecimal;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author twolak
 *
 */
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"recipe"})
public class Ingredient {

	private String id;
	private String description;
	private BigDecimal amount;
	private UnitOfMeasure unitOfMeasure;
	private Recipe recipe;
	
	public Ingredient(String description, BigDecimal amount, UnitOfMeasure unitOfMeasure) {
		this.description = description;
		this.amount = amount;
		this.unitOfMeasure = unitOfMeasure;
	}
	
	public Ingredient(String description, BigDecimal amount, UnitOfMeasure unitOfMeasure, Recipe recipe) {
		this.description = description;
		this.amount = amount;
		this.unitOfMeasure = unitOfMeasure;
		this.recipe = recipe;
	}
}