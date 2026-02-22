package com.example.EComOrder.DTO;


import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequestDTO {
    private long UserId;
    private List<OrderDetailsDTO> orderDetails;
}
