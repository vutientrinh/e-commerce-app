package com.example.customer.customer;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Document
@Validated
public class Address {
    private String street;
    private String houseNumber;
    private String zipCode;
}
