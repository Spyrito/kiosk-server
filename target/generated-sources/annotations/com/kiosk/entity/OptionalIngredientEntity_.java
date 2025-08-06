package com.kiosk.entity;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(OptionalIngredientEntity.class)
public abstract class OptionalIngredientEntity_ {

	public static volatile SingularAttribute<OptionalIngredientEntity, ItemEntity> item;
	public static volatile SingularAttribute<OptionalIngredientEntity, Integer> extraPrice;
	public static volatile SingularAttribute<OptionalIngredientEntity, String> name;
	public static volatile SingularAttribute<OptionalIngredientEntity, Long> id;

	public static final String ITEM = "item";
	public static final String EXTRA_PRICE = "extraPrice";
	public static final String NAME = "name";
	public static final String ID = "id";

}

