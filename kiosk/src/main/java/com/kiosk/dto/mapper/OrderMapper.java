package com.kiosk.dto.mapper;

import com.kiosk.dto.OrderDTO;
import com.kiosk.entity.OrderEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = { OrderItemMapper.class })
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    OrderDTO toDTO(OrderEntity entity);
    OrderEntity toEntity(OrderDTO dto);
}

