package com.kiosk.dto.mapper;

import com.kiosk.dto.OptionalIngredientDTO;
import com.kiosk.entity.OptionalIngredientEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OptionalIngredientMapper {
    OptionalIngredientDTO toDTO(OptionalIngredientEntity entity);
    OptionalIngredientEntity toEntity(OptionalIngredientDTO dto);
}

