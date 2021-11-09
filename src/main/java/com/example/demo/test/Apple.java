package com.example.demo.test;

import org.springframework.stereotype.Component;

@Component("ap")
public class Apple implements Item{
    public void getPrice(){
        System.out.println("20");
    }
}
