package com.example.EComOrder.entity;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderItemsEntity extends BaseEntity{

    private long productId;
    private int count;
    private double individualPrice;
    private double totalPrice;

    @ManyToOne
    @JoinColumn(name = "orderId", nullable = false)
    private OrderEntity order;
}
