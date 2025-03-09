package com.example.customer.controller;

import com.example.customer.customer.Customer;
import com.example.customer.dto.CustomerRequest;
import com.example.customer.dto.CustomerResponse;
import com.example.customer.service.CustomerService;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping
    public ResponseEntity<String> createCustomer(@RequestBody @Valid CustomerRequest request){
        return ResponseEntity.ok(customerService.createCustomer(request));
    }
    @PutMapping
    public ResponseEntity<Void> updateCustomer(
            @RequestBody @Valid CustomerRequest request
    ){
        customerService.updateCustomer(request);
        return ResponseEntity.accepted().build();
    }

    @GetMapping
    public ResponseEntity<List<CustomerResponse>> findAll(){
        return ResponseEntity.ok(customerService.findAllCustomers());
    }

    @GetMapping("/exits/{customer-id}")
    public ResponseEntity<Boolean> existsById(@PathVariable("customer-id") String customerId){
        return ResponseEntity.ok(customerService.exitsIsById(customerId));
    }

    @GetMapping("/{customer-id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable("customer-id") String customerId){
        return ResponseEntity.ok(customerService.findById(customerId));
    }

    @DeleteMapping("/customer-id")
    public ResponseEntity<Void> deleteCustomer(
            @PathVariable("customer-id") String customerId
    ){
        customerService.deleteCustomer(customerId);
        return ResponseEntity.accepted().build();
    }
}
