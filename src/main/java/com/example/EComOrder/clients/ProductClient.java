package com.example.EComOrder.clients;


import com.example.EComOrder.DTO.ProductsDTO;
import com.example.EComOrder.config.ProductBaseURL;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ProductClient {
    private final RestTemplate restTemplate;
    private final ProductBaseURL productBaseURL;

    public ProductClient(RestTemplate restTemplate, ProductBaseURL productBaseURL) {
        this.restTemplate = restTemplate;
        this.productBaseURL = productBaseURL;
    }

    public ProductsDTO getProductById(Long productId) {
        String url = productBaseURL.getBaseURL() + productId;
        ResponseEntity<ProductsDTO> responseEntity = this.restTemplate.getForEntity(url, ProductsDTO.class);
        return responseEntity.getBody();
    }
}
