package com.bright.pagingdemo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(
        name = "products",
        uniqueConstraints = {
                @UniqueConstraint(
                    columnNames = {"product_name", "product_category"}
                )
        }
)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "product_name")
    private String name;
    @Column(name = "product_category")
    private String category;
    private BigDecimal price;

    public Product(String name, String category, BigDecimal price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }
}
