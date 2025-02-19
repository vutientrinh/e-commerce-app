package com.example.product.product;

import jakarta.validation.constraints.NotNull;

public record ProductPurchaseRequest(

        @NotNull(message = "Product is mandatory")
        Integer productId,

        @NotNull(message = "Product is mandatory")
        double quantity
) {
}
