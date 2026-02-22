package com.example.EComOrder.DTO;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDetailsDTO {
    private long productId;
    private int quantity;
}
