package com.kiosk.dto.mapper;

import com.kiosk.dto.OptionalIngredientDTO;
import com.kiosk.entity.OptionalIngredientEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-08-06T11:06:32+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class OptionalIngredientMapperImpl implements OptionalIngredientMapper {

    @Override
    public OptionalIngredientDTO toDTO(OptionalIngredientEntity entity) {
        if ( entity == null ) {
            return null;
        }

        OptionalIngredientDTO optionalIngredientDTO = new OptionalIngredientDTO();

        return optionalIngredientDTO;
    }

    @Override
    public OptionalIngredientEntity toEntity(OptionalIngredientDTO dto) {
        if ( dto == null ) {
            return null;
        }

        OptionalIngredientEntity optionalIngredientEntity = new OptionalIngredientEntity();

        return optionalIngredientEntity;
    }
}
