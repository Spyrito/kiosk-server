package com.kiosk.dto.mapper;

import com.kiosk.dto.OrderDTO;
import com.kiosk.dto.OrderItemDTO;
import com.kiosk.entity.OrderEntity;
import com.kiosk.entity.OrderItemEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderItemMapper {

    OrderItemDTO toDTO(OrderItemEntity entity);
    OrderEntity toEntity(OrderDTO dto);

}

