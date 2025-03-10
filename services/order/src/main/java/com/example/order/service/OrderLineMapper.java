package com.example.order.service;

import com.example.order.dto.OrderLineRequest;
import com.example.order.order.Order;
import com.example.order.order.OrderLine;
import com.example.order.repository.OrderLineRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderLineMapper {
    public OrderLine toOrderLine(OrderLineRequest orderLineRequest) {
        return OrderLine.builder()
                .id(orderLineRequest.id())
                .quantity(orderLineRequest.quantity())
                .order(
                        Order.builder()
                                .id(orderLineRequest.orderId())
                                .build()
                )
                .productId(orderLineRequest.productId())
                .build();
    }
}
