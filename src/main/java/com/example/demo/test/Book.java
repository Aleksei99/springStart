package com.example.demo.test;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Book implements Item{
    public void getPrice(){
        System.out.println("400");
    }
}
