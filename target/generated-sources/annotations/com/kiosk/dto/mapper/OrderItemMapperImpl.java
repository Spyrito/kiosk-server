package com.kiosk.dto.mapper;

import com.kiosk.dto.OrderDTO;
import com.kiosk.dto.OrderItemDTO;
import com.kiosk.entity.OrderEntity;
import com.kiosk.entity.OrderItemEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-08-06T11:13:49+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class OrderItemMapperImpl implements OrderItemMapper {

    @Override
    public OrderItemDTO toDTO(OrderItemEntity entity) {
        if ( entity == null ) {
            return null;
        }

        OrderItemDTO orderItemDTO = new OrderItemDTO();

        return orderItemDTO;
    }

    @Override
    public OrderEntity toEntity(OrderDTO dto) {
        if ( dto == null ) {
            return null;
        }

        OrderEntity orderEntity = new OrderEntity();

        return orderEntity;
    }
}
