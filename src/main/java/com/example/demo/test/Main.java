package com.example.demo.test;

import com.example.demo.DemoApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.WebApplicationContext;

@Configuration
@ComponentScan
public class Main {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        final Store store = context.getBean("store", Store.class);
        final Store store2 = context.getBean("store", Store.class);
        System.out.println(store==store2);
        store.getProductPrice();

    }
}
