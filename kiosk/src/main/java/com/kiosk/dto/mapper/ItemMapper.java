package com.kiosk.dto.mapper;

import com.kiosk.dto.ItemDTO;
import com.kiosk.entity.ItemEntity;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring", uses = { IngredientMapper.class, OptionalIngredientMapper.class })
public interface ItemMapper {
    ItemDTO toDTO(ItemEntity entity);
    ItemEntity toEntity(ItemDTO dto);
}

