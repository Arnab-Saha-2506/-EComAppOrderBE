package com.example.EComOrder.service;

import com.example.EComOrder.DTO.OrderRequestDTO;
import com.example.EComOrder.DTO.OrderResponseDTO;

public interface OrderService {

    public OrderResponseDTO createOrder(OrderRequestDTO orderRequestDTO);
}
