package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.ProductModel;
import com.example.demo.repositories.ProductRepository;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<ProductModel> getProduct(){
        return productRepository.findAll();
    }

    public void save(ProductModel product){
        productRepository.save(product);
    }

    public void deleteById(Integer id){
        productRepository.deleteById(id);
    }
}
