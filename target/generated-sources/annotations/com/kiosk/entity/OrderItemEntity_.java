package com.kiosk.entity;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(OrderItemEntity.class)
public abstract class OrderItemEntity_ {

	public static volatile SingularAttribute<OrderItemEntity, Integer> quantity;
	public static volatile SingularAttribute<OrderItemEntity, Long> id;
	public static volatile SingularAttribute<OrderItemEntity, ItemEntity> menuItem;
	public static volatile SingularAttribute<OrderItemEntity, BigDecimal> priceAtOrderTime;
	public static volatile SingularAttribute<OrderItemEntity, String> customizations;
	public static volatile SingularAttribute<OrderItemEntity, OrderEntity> order;

	public static final String QUANTITY = "quantity";
	public static final String ID = "id";
	public static final String MENU_ITEM = "menuItem";
	public static final String PRICE_AT_ORDER_TIME = "priceAtOrderTime";
	public static final String CUSTOMIZATIONS = "customizations";
	public static final String ORDER = "order";

}

