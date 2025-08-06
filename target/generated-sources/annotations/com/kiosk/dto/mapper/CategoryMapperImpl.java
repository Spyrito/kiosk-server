package com.kiosk.dto.mapper;

import com.kiosk.dto.CategoryDTO;
import com.kiosk.entity.CategoryEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-08-06T12:26:46+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public CategoryDTO toDTO(CategoryEntity entity) {
        if ( entity == null ) {
            return null;
        }

        CategoryDTO categoryDTO = new CategoryDTO();

        return categoryDTO;
    }

    @Override
    public CategoryEntity toEntity(CategoryDTO dto) {
        if ( dto == null ) {
            return null;
        }

        CategoryEntity categoryEntity = new CategoryEntity();

        return categoryEntity;
    }
}
