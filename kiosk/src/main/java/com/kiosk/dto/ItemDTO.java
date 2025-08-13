package com.kiosk.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDTO {
    @JsonProperty("_id")
    private Long id;

    private String name;
    private String description;
    private BigDecimal price;
    private String imageUrl;
    private Long categoryId;
    private Integer availableQuantity;

    private List<ItemIngredientDTO> ingredients;

    private List<Long> allergenIds;
    private List<Long> optionalIngredientIds;
}


