package com.example.demo.service;

import com.example.demo.dao.Man;
import com.example.demo.dao.Product;
import com.example.demo.dao.repository.ManRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManServiceImpl implements ManService{

    private final ManRepository manRepository;

    @Autowired
    public ManServiceImpl(ManRepository manRepository) {
        this.manRepository = manRepository;
    }

    @Override
    public Man findManById(int id) {
        return manRepository.findManById(id);
    }

    @Override
    public List<Product> findManProducts(int id) {
        return manRepository.findManById(id).getProducts();
    }
}
