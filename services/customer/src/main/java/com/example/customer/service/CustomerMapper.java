package com.example.customer.service;

import com.example.customer.customer.Customer;
import com.example.customer.dto.CustomerRequest;
import lombok.Builder;
import org.springframework.stereotype.Service;

@Service
public class CustomerMapper {
    public Customer toCustomer(CustomerRequest request) {
        return  Customer.builder()
                .id(request.id())
                .firstName(request.firstname())
                .lastName(request.lastname())
                .email(request.email())
                .address(request.address())
                .build();
    }
}
