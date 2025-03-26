package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.ProductModel;
import com.example.demo.services.ProductService;

@RestController
@RequestMapping(path = "product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping()
    public List<ProductModel> getAll(){
        return productService.getProduct();
    }

    @PostMapping()
    public void save(@RequestBody ProductModel productModel){
        productService.save(productModel);
    }

    @DeleteMapping("/{productId}")
    public void delete(@PathVariable("productId") Integer id){
        productService.deleteById(id);
    }
}
