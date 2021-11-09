package com.example.demo.web.controller;

import com.example.demo.service.ManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {
    private final ManService manService;

    @Autowired
    public FirstController(ManService manService) {
        this.manService = manService;
    }

    @GetMapping("/")
    public String getFirstPage(@RequestParam("name") String name){
        System.out.println(name);
        return "page";
    }

    @GetMapping("/people/{id}")
    public String getPerson(@PathVariable String id){
        System.out.println(manService.findManById(Integer.parseInt(id)));
        System.out.println(manService.findManProducts(Integer.parseInt(id)));
        return "page";
    }
}
