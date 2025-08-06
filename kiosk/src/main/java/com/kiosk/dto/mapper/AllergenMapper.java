package com.kiosk.dto.mapper;

import com.kiosk.dto.AllergenDTO;
import com.kiosk.entity.AllergenEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AllergenMapper {
    AllergenDTO toDTO(AllergenEntity entity);
    AllergenEntity toEntity(AllergenDTO dto);
}
