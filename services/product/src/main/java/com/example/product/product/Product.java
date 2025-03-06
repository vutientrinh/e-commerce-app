package com.example.product.product;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class Product {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String description;
    private double availableQuality;
    private BigDecimal price;
    @ManyToOne
    @JoinColumn(name = "category-id")
    private Category category;
}
