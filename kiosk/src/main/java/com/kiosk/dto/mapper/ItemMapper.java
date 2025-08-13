package com.kiosk.dto.mapper;

import com.kiosk.dto.ItemDTO;
import com.kiosk.dto.ItemIngredientDTO;
import com.kiosk.entity.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface ItemMapper {

    @Mapping(target = "categoryId", source = "category.id")
    @Mapping(target = "ingredients", expression = "java(mapItemIngredients(entity.getItemIngredients()))")
    @Mapping(target = "allergenIds", expression = "java(mapAllergenIds(entity.getAllergens()))")
    @Mapping(target = "optionalIngredientIds", expression = "java(mapOptionalIds(entity.getOptionalIngredients()))")
    ItemDTO toDTO(ItemEntity entity);

    @Mapping(target = "itemIngredients", expression = "java(mapItemIngredientEntities(dto.getIngredients()))")
    @Mapping(target = "category", ignore = true) // nastavíš později ve službě podle categoryId
    @Mapping(target = "allergens", ignore = true) // nebo namapuješ později
    @Mapping(target = "optionalIngredients", ignore = true)
    ItemEntity toEntity(ItemDTO dto);

    // ===== Ingredience s množstvím =====
    default List<ItemIngredientDTO> mapItemIngredients(Set<ItemIngredientEntity> entities) {
        if (entities == null) return Collections.emptyList();
        return entities.stream()
                .map(e -> new ItemIngredientDTO(
                        e.getIngredient().getId(),
                        e.getQuantity()
                ))
                .collect(Collectors.toList());
    }

    default Set<ItemIngredientEntity> mapItemIngredientEntities(List<ItemIngredientDTO> dtos) {
        if (dtos == null) return Collections.emptySet();
        return dtos.stream()
                .map(dto -> {
                    ItemIngredientEntity e = new ItemIngredientEntity();
                    IngredientEntity ingredient = new IngredientEntity();
                    ingredient.setId(dto.getIngredientId());
                    e.setIngredient(ingredient);
                    e.setQuantity(dto.getQuantity());
                    return e;
                })
                .collect(Collectors.toSet());
    }

    // ===== Zbytek mapperů =====
    default List<Long> mapAllergenIds(Set<AllergenEntity> allergens) {
        if (allergens == null) return Collections.emptyList();
        return allergens.stream()
                .map(AllergenEntity::getId)
                .collect(Collectors.toList());
    }

    default List<Long> mapOptionalIds(Set<OptionalIngredientEntity> optionals) {
        if (optionals == null) return Collections.emptyList();
        return optionals.stream()
                .map(OptionalIngredientEntity::getId)
                .collect(Collectors.toList());
    }
}

