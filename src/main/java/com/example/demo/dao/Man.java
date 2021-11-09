package com.example.demo.dao;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;


@Table(name = "man")
@Entity
@Getter
@Setter
@ToString
public class Man extends BaseEntity{
    @Column(unique = true)
    private String name;
    private BigDecimal age;
    private Date birthday;

    @ManyToMany
    @JoinTable(name = "basket",
            joinColumns = @JoinColumn(name = "man_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id"))
    private List<Product> products;

}