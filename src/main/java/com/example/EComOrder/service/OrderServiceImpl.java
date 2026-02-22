package com.example.EComOrder.service;


import com.example.EComOrder.DTO.OrderDetailsDTO;
import com.example.EComOrder.DTO.OrderRequestDTO;
import com.example.EComOrder.DTO.OrderResponseDTO;
import com.example.EComOrder.DTO.ProductsDTO;
import com.example.EComOrder.clients.ProductClient;
import com.example.EComOrder.entity.OrderEntity;
import com.example.EComOrder.entity.OrderItemsEntity;
import com.example.EComOrder.mapper.OrderDetailsMapper;
import com.example.EComOrder.mapper.OrderMapper;
import com.example.EComOrder.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final ProductClient productClient;

    public OrderServiceImpl(OrderRepository orderRepository, ProductClient productClient) {
        this.orderRepository = orderRepository;
        this.productClient = productClient;
    }

    @Override
    public OrderResponseDTO createOrder(OrderRequestDTO orderRequestDTO){
        OrderEntity entity = OrderMapper.toOrderEntity(orderRequestDTO);
//        ProductEntity productEntity = ProductEntity.getProductById(orderRequestDTO.getOrderDetails().getProductId());
        List<OrderItemsEntity> orderItemsEntityArrayList = new ArrayList<>();
        for(OrderDetailsDTO dto: orderRequestDTO.getOrderDetails()){
            ProductsDTO productDetails = productClient.getProductById(dto.getProductId());
            double individualPrice = productDetails.getPrice();
            double totalPrice = individualPrice * dto.getQuantity();

            OrderItemsEntity orderItemsEntity = OrderDetailsMapper.toOrderItemsEntity(
                    dto, entity, individualPrice, totalPrice
            );

            orderItemsEntityArrayList.add(orderItemsEntity);

        }
        entity.setOrderItems(orderItemsEntityArrayList);
        OrderEntity orderEntityResponse = orderRepository.save(entity);
        return OrderMapper.toOrderResponseDTO(orderEntityResponse);
    }
}
