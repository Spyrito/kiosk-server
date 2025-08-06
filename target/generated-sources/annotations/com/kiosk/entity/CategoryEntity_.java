package com.kiosk.entity;

import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.util.UUID;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CategoryEntity.class)
public abstract class CategoryEntity_ {

	public static volatile SingularAttribute<CategoryEntity, String> name;
	public static volatile SingularAttribute<CategoryEntity, Integer> displayOrder;
	public static volatile SingularAttribute<CategoryEntity, Boolean> active;
	public static volatile SingularAttribute<CategoryEntity, UUID> id;
	public static volatile ListAttribute<CategoryEntity, ItemEntity> items;

	public static final String NAME = "name";
	public static final String DISPLAY_ORDER = "displayOrder";
	public static final String ACTIVE = "active";
	public static final String ID = "id";
	public static final String ITEMS = "items";

}

