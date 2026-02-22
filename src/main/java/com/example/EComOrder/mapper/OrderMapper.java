package com.example.EComOrder.mapper;

import com.example.EComOrder.DTO.OrderRequestDTO;
import com.example.EComOrder.DTO.OrderResponseDTO;
import com.example.EComOrder.entity.OrderEntity;
import com.example.EComOrder.enums.OrderStatus;

public class OrderMapper {
    public static OrderEntity toOrderEntity(OrderRequestDTO orderRequestDTO){
        return OrderEntity.builder()
                .userId(orderRequestDTO.getUserId())
                .orderStatus(OrderStatus.PENDING)
                .build();
    }

    public static OrderResponseDTO toOrderResponseDTO(OrderEntity orderEntity){
        return OrderResponseDTO.builder()
                .orderId(orderEntity.getId())
                .status(orderEntity.getOrderStatus())
                .build();
    }
}
