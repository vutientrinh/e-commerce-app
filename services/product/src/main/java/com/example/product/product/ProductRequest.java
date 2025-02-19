package com.example.product.product;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

public record ProductRequest (
        Integer id,
        @NotNull(message = "Product name is required!!")
        String name,
        @NotNull(message = "Product description is required!!")

        String description,
        @Positive(message = "Available quantity should be positive")
        double availableQuantity,
        @Positive(message = "Price should be positive")
        BigDecimal price,
        @NotNull(message = "Price category is required!!")
        Integer categoryId
){
}
