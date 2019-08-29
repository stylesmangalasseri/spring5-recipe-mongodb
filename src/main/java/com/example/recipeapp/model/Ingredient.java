package com.example.recipeapp.model;

import java.math.BigDecimal;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ingredient {

    @Id
	private String id = UUID.randomUUID().toString();
	private String description;
	private BigDecimal amount;
	@DBRef
	private UnitOfMeasure unitOfMeasure;

	public Ingredient() {
	}

	public Ingredient(String description, BigDecimal amount, UnitOfMeasure unitOfMeasure) {
		this.description = description;
		this.amount = amount;
		this.unitOfMeasure = unitOfMeasure;
	}

	public Ingredient(String description, BigDecimal amount, UnitOfMeasure unitOfMeasure, Recipe recipe) {
        this.description = description;
        this.amount = amount;
        this.unitOfMeasure = unitOfMeasure;
    }
}
