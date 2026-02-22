package com.example.EComOrder.DTO;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductsDTO {
    private Long id;
    private String title;
    private double price;
    private String brand;
    private String description;
    private String discountPercentage;
    private String color;
    private boolean popular;
    private Long categoryId;
    private String image;
}