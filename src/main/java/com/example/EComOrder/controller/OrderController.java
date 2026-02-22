package com.example.EComOrder.controller;


import com.example.EComOrder.DTO.OrderRequestDTO;
import com.example.EComOrder.DTO.OrderResponseDTO;
import com.example.EComOrder.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    public ResponseEntity<OrderResponseDTO> createOrder(@RequestBody OrderRequestDTO orderRequestDTO){
        OrderResponseDTO response = orderService.createOrder(orderRequestDTO);
        return ResponseEntity.ok().body(response);
    }
}
