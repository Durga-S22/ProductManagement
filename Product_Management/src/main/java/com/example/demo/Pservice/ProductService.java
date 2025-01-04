package com.example.demo.Pservice;

import java.util.List;

import com.example.demo.Product;

public interface ProductService {

    public String upsert(Product product);
    public Product getById(int id);
    public List<Product> getAllProducts();
    public String deleteById(int id);
}
