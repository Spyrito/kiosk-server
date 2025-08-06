package com.kiosk.dto.mapper;

import com.kiosk.dto.CategoryDTO;
import com.kiosk.entity.CategoryEntity;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryDTO toDTO(CategoryEntity entity);
    CategoryEntity toEntity(CategoryDTO dto);
}

