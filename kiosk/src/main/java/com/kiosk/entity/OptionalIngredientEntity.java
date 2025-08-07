package com.kiosk.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "optional_ingredients")
@Getter
@Setter

public class OptionalIngredientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private int extraPrice;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private ItemEntity item;
}

