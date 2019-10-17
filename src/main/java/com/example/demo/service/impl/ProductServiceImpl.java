package com.example.demo.service.impl;

import com.example.demo.entity.Product;
import com.example.demo.mapper.ProductMapper;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;

    @Override
    public List<Product> getAllProduct() {
        return productMapper.getAllProducts();
    }

    @Override
    public int getProductQuantityById(int id) {
        return productMapper.getProductQuantityById(id);
    }
}
