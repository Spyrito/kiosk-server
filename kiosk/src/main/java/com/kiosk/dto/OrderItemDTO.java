package com.kiosk.dto;

import java.math.BigDecimal;
import java.util.List;

public class OrderItemDTO {
    private Long itemId;
    private String itemName;
    private BigDecimal unitPrice;
    private int quantity;

    private List<Long> removedIngredientIds;
    private List<Long> addedOptionalIngredientIds;
}
