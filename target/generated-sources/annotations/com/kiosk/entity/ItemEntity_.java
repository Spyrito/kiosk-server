package com.kiosk.entity;

import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.util.UUID;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ItemEntity.class)
public abstract class ItemEntity_ {

	public static volatile SingularAttribute<ItemEntity, Integer> availableQuantity;
	public static volatile SingularAttribute<ItemEntity, BigDecimal> price;
	public static volatile SingularAttribute<ItemEntity, String> name;
	public static volatile SingularAttribute<ItemEntity, String> description;
	public static volatile ListAttribute<ItemEntity, IngredientEntity> ingredients;
	public static volatile SingularAttribute<ItemEntity, UUID> id;
	public static volatile SingularAttribute<ItemEntity, CategoryEntity> category;
	public static volatile ListAttribute<ItemEntity, AllergenEntity> allergens;

	public static final String AVAILABLE_QUANTITY = "availableQuantity";
	public static final String PRICE = "price";
	public static final String NAME = "name";
	public static final String DESCRIPTION = "description";
	public static final String INGREDIENTS = "ingredients";
	public static final String ID = "id";
	public static final String CATEGORY = "category";
	public static final String ALLERGENS = "allergens";

}

