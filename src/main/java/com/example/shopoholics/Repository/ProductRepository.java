package com.example.shopoholics.Repository;

import com.example.shopoholics.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{
}
