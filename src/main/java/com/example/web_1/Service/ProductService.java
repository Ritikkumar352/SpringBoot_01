package com.example.web_1.Service;

import com.example.web_1.Model.Product;
import com.example.web_1.repositary.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;


//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101, "Iphone", 5000),
//            new Product(102, "BhaiPhone", 10000),
//            new Product(103, "Phone", 1000)));

    public List<Product> getProducts() {

        return repo.findAll();
    }

    public Product getProductById(int prodId) {
        // JAVA Stream API

        return repo.findById(prodId)
                .orElse(null);

    }

    // to Add product

    public void addProduct(Product prod) {
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
        repo.save(prod);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);

    }
}
