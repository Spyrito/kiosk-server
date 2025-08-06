package com.kiosk.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
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

    private List<IngredientDTO> ingredients;
    private List<AllergenDTO> allergens;
    private List<OptionalIngredientDTO> optionalIngredients;
}

