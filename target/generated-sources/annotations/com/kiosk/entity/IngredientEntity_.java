package com.kiosk.entity;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(IngredientEntity.class)
public abstract class IngredientEntity_ {

	public static volatile SingularAttribute<IngredientEntity, ItemEntity> item;
	public static volatile SingularAttribute<IngredientEntity, String> name;
	public static volatile SingularAttribute<IngredientEntity, Long> id;

	public static final String ITEM = "item";
	public static final String NAME = "name";
	public static final String ID = "id";

}

