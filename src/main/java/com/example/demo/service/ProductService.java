package com.example.demo.service;

import com.example.demo.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProduct();

    int getProductQuantityById(int id);
}
