package com.kiosk.dto;

import java.math.BigDecimal;
import java.util.List;

public class ItemDTO {
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private String imageUrl;
    private Long categoryId;

    private List<IngredientDTO> ingredients;
    private List<AllergenDTO> allergens;
    private List<OptionalIngredientDTO> optionalIngredients;
}

