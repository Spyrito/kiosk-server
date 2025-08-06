package com.kiosk.dto.mapper;

import com.kiosk.dto.AllergenDTO;
import com.kiosk.entity.AllergenEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-08-06T11:30:43+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class AllergenMapperImpl implements AllergenMapper {

    @Override
    public AllergenDTO toDTO(AllergenEntity entity) {
        if ( entity == null ) {
            return null;
        }

        AllergenDTO allergenDTO = new AllergenDTO();

        return allergenDTO;
    }

    @Override
    public AllergenEntity toEntity(AllergenDTO dto) {
        if ( dto == null ) {
            return null;
        }

        AllergenEntity allergenEntity = new AllergenEntity();

        return allergenEntity;
    }
}
