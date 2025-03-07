package com.example.product.dto;

import java.math.BigDecimal;

public record ProductResponse(

        Integer id,
        String name,
        String description,
        double availableQuantity,
        BigDecimal price
) {
}
