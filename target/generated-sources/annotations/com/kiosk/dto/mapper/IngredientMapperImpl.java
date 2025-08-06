package com.kiosk.dto.mapper;

import com.kiosk.dto.IngredientDTO;
import com.kiosk.entity.IngredientEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-08-06T12:26:46+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class IngredientMapperImpl implements IngredientMapper {

    @Override
    public IngredientDTO toDTO(IngredientEntity entity) {
        if ( entity == null ) {
            return null;
        }

        IngredientDTO ingredientDTO = new IngredientDTO();

        return ingredientDTO;
    }

    @Override
    public IngredientEntity toEntity(IngredientDTO dto) {
        if ( dto == null ) {
            return null;
        }

        IngredientEntity ingredientEntity = new IngredientEntity();

        return ingredientEntity;
    }
}
