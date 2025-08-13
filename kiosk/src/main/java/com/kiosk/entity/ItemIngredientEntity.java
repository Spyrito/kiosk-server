package com.kiosk.entity;

import com.kiosk.id.ItemIngredientId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "item_ingredient")
@Getter
@Setter
public class ItemIngredientEntity {

    @EmbeddedId
    private ItemIngredientId id = new ItemIngredientId();

    @ManyToOne
    @MapsId("itemId")
    @JoinColumn(name = "item_id")
    private ItemEntity item;

    @ManyToOne
    @MapsId("ingredientId")
    @JoinColumn(name = "ingredient_id")
    private IngredientEntity ingredient;

    @Column(nullable = false)
    private Integer quantity;
}

