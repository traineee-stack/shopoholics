package com.example.shopoholics.Services;

import com.example.shopoholics.Entity.Product;
import com.example.shopoholics.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServices {

    @Autowired
    private ProductRepository productRepo;

    public Product saveProduct(Product product){
        return productRepo.save(product);
    }

    public List<Product> saveAllProduct(List<Product> product){
        return productRepo.saveAll(product);
    }

    public Optional<Product> getProductByID(long id){
        return productRepo.findById(id);
    }

    public List<Product> getAllProduct(){
        return productRepo.findAll();
    }

    public void deleteProduct(long id){
        productRepo.deleteById(id);
    }

}
