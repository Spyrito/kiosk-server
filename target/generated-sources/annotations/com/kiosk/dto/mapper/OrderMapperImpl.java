package com.kiosk.dto.mapper;

import com.kiosk.dto.OrderDTO;
import com.kiosk.entity.OrderEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-08-06T12:26:46+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class OrderMapperImpl implements OrderMapper {

    @Override
    public OrderDTO toDTO(OrderEntity entity) {
        if ( entity == null ) {
            return null;
        }

        OrderDTO orderDTO = new OrderDTO();

        return orderDTO;
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
