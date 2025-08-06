package com.kiosk.entity;

import com.kiosk.constant.OrderStatus;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDateTime;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(OrderEntity.class)
public abstract class OrderEntity_ {

	public static volatile SingularAttribute<OrderEntity, LocalDateTime> createdAt;
	public static volatile SingularAttribute<OrderEntity, Integer> orderNumber;
	public static volatile SingularAttribute<OrderEntity, Boolean> paid;
	public static volatile SingularAttribute<OrderEntity, String> kioskIdentifier;
	public static volatile SingularAttribute<OrderEntity, Long> id;
	public static volatile ListAttribute<OrderEntity, OrderItemEntity> items;
	public static volatile SingularAttribute<OrderEntity, OrderStatus> status;

	public static final String CREATED_AT = "createdAt";
	public static final String ORDER_NUMBER = "orderNumber";
	public static final String PAID = "paid";
	public static final String KIOSK_IDENTIFIER = "kioskIdentifier";
	public static final String ID = "id";
	public static final String ITEMS = "items";
	public static final String STATUS = "status";

}

