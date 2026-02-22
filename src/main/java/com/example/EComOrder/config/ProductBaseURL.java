package com.example.EComOrder.config;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "base-url")
public class ProductBaseURL {
    private String baseURL;
}
