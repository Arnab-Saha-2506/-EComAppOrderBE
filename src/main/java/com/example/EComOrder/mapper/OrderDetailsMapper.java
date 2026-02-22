package com.example.EComOrder.mapper;

import com.example.EComOrder.DTO.OrderDetailsDTO;
import com.example.EComOrder.DTO.ProductsDTO;
import com.example.EComOrder.entity.OrderEntity;
import com.example.EComOrder.entity.OrderItemsEntity;

public class OrderDetailsMapper {
    public static OrderItemsEntity toOrderItemsEntity(OrderDetailsDTO dto, OrderEntity order, double individualPrice, double totalPrice){
        return OrderItemsEntity.builder()
                .productId(dto.getProductId())
                .individualPrice(individualPrice)
                .totalPrice(totalPrice)
                .count(dto.getQuantity())
                .order(order)
                .build();
    }
}
