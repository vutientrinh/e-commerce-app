package com.example.order.kafka;

import com.example.order.customer.CustomerResponse;
import com.example.order.product.PaymentMethod;
import com.example.order.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products
) {
}
