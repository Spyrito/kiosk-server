package com.kiosk.dto.mapper;

import com.kiosk.dto.ItemDTO;
import com.kiosk.entity.ItemEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-08-06T12:26:46+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class ItemMapperImpl implements ItemMapper {

    @Override
    public ItemDTO toDTO(ItemEntity entity) {
        if ( entity == null ) {
            return null;
        }

        ItemDTO itemDTO = new ItemDTO();

        return itemDTO;
    }

    @Override
    public ItemEntity toEntity(ItemDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ItemEntity itemEntity = new ItemEntity();

        return itemEntity;
    }
}
