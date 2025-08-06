package com.kiosk.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "ingredients")
@Getter
@Setter

public class AllergenEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private ItemEntity item;


}

