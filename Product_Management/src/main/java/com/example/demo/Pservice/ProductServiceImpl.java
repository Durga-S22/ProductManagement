package com.example.demo.Pservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Product;
import com.example.demo.Prepo.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepo;

    @Override
    public String upsert(Product product) {
        productRepo.save(product);
        return "Product saved successfully!";
    }

    @Override
    public Product getById(int id) {
    	Optional<Product> findById= productRepo.findById(id);
    	if(findById.isPresent()) {
    		return findById.get();
    	}
    	return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public String deleteById(int id) {
        if (productRepo.existsById(id)) {
            productRepo.deleteById(id);
            return "Product deleted successfully!";
        }
        return "Product not found!";
    }
}
