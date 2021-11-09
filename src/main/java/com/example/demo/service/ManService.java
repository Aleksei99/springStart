package com.example.demo.service;

import com.example.demo.dao.Man;
import com.example.demo.dao.Product;

import java.util.List;

public interface ManService {
    Man findManById(int id);
    List<Product> findManProducts(int id);
}
