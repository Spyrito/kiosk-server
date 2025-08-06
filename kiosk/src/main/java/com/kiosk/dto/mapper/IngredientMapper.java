package com.kiosk.dto.mapper;

import com.kiosk.dto.IngredientDTO;
import com.kiosk.entity.IngredientEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IngredientMapper {
    IngredientDTO toDTO(IngredientEntity entity);
    IngredientEntity toEntity(IngredientDTO dto);
}

