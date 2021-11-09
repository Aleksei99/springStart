package com.example.demo.test;

import lombok.EqualsAndHashCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@EqualsAndHashCode
@Scope("prototype")
public class Store {
    private final Item item;

    @Autowired
    public Store(@Qualifier("ap")Item item) {
        this.item = item;
    }

    public void getProductPrice(){

        item.getPrice();

    }
}
