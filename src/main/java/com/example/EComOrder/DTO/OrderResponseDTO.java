package com.example.EComOrder.DTO;

import com.example.EComOrder.enums.OrderStatus;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponseDTO {

    private Long orderId;
    private OrderStatus status;
}
