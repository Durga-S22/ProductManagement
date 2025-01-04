package com.example.demo.Prepo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Product;

public interface ProductRepository extends JpaRepository<Product, Serializable> {
	
}
