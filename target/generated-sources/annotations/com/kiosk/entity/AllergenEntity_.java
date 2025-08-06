package com.kiosk.entity;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AllergenEntity.class)
public abstract class AllergenEntity_ {

	public static volatile SingularAttribute<AllergenEntity, ItemEntity> item;
	public static volatile SingularAttribute<AllergenEntity, String> name;
	public static volatile SingularAttribute<AllergenEntity, Long> id;

	public static final String ITEM = "item";
	public static final String NAME = "name";
	public static final String ID = "id";

}

