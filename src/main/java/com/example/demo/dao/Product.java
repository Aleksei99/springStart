package com.example.demo.dao;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "products")
@Entity
@Getter
@ToString
public class Product extends BaseEntity {
    @Column(name = "name", length = 45)
    private String name;

    @Column(name = "price", precision = 7, scale = 2)
    private BigDecimal price;

}