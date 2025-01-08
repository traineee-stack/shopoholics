package com.example.shopoholics.Controller;

import com.example.shopoholics.Entity.Product;
import com.example.shopoholics.Services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/product")
public class ProductController {

    @Autowired
    private ProductServices productServices;

    @PostMapping("/submitproduct")
    public Product createProduct(@RequestBody Product product){
        return productServices.saveProduct(product);
    }

    @PostMapping("/allproduct")
    public List<Product> createAllProduct(@RequestBody List<Product> product){
        return productServices.saveAllProduct(product);
    }

    @GetMapping("/getproduct/{id}")
    public Optional<Product> getProductById(@PathVariable long id){
        return productServices.getProductByID(id);
    }

    @GetMapping("/getallproduct")
    public List<Product> getAllProduct(){
        return productServices.getAllProduct();
    }

    @DeleteMapping("/deleteproduct")
    public void deleteProductbyId(@PathVariable long id){
        productServices.deleteProduct(id);
    }

}
