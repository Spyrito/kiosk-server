package com.kiosk.dto.mapper;

import com.kiosk.dto.ItemDTO;
import com.kiosk.entity.AllergenEntity;
import com.kiosk.entity.IngredientEntity;
import com.kiosk.entity.ItemEntity;
import com.kiosk.entity.OptionalIngredientEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface ItemMapper {
    @Mapping(target = "categoryId", source = "category.id")
    @Mapping(target = "ingredientIds", expression = "java(mapIngredientIds(entity.getIngredients()))")
    @Mapping(target = "allergenIds", expression = "java(mapAllergenIds(entity.getAllergens()))")
    @Mapping(target = "optionalIngredientIds", expression = "java(mapOptionalIds(entity.getOptionalIngredients()))")

    ItemDTO toDTO(ItemEntity entity);
    ItemEntity toEntity(ItemDTO dto);

    default List<Long> mapIngredientIds(List<IngredientEntity> ingredients) {
        if (ingredients == null) return Collections.emptyList();
        return ingredients.stream()
                .map(IngredientEntity::getId)
                .collect(Collectors.toList());
    }

    default List<Long> mapAllergenIds(List<AllergenEntity> allergens) {
        if (allergens == null) return Collections.emptyList();
        return allergens.stream()
                .map(AllergenEntity::getId)
                .collect(Collectors.toList());
    }

    default List<Long> mapOptionalIds(List<OptionalIngredientEntity> optionals) {
        if (optionals == null) return Collections.emptyList();
        return optionals.stream()
                .map(OptionalIngredientEntity::getId)
                .collect(Collectors.toList());
    }
}

