package com.example.order.service;

import com.example.order.customer.CustomerClient;
import com.example.order.dto.OrderRequest;
import com.example.order.exception.BusinessException;
import com.example.order.product.ProductClient;
import com.example.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final CustomerClient customerClient;
    private final ProductClient productClient;
    private final OrderRepository orderRepository;
    private final OrderMapper mapper;
    public Integer createOrder(OrderRequest orderRequest) {
        //check the customer
        var customer = this.customerClient.findCustomerById(orderRequest.customerId())
                .orElseThrow(()-> new BusinessException("Cannot create order :: No Customer exists with the provided ID"));
        //purchase the products --> product-ms
        this.productClient.purchaseProducts(orderRequest.products());
        var order = this.orderRepository.save(mapper.toOrder(orderRequest));
        //persist order


        //persist order lines

        //start payment process


        //send the order confirmation --> notification-ms (kafka)
        return null;
    }
}
