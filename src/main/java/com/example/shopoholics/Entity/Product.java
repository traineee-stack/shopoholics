package com.example.shopoholics.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double price;
    private int stockQuantity;
    private LocalDate CreatedDate;
    private LocalDate UpdatedDate;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;

    public Product() {
    }

    public Category getCategory() {return category;}

    public void setCategory(Category category) {this.category = category;}

    public Product(Long id, String name, String description, Double price, int stockQuantity, LocalDate updatedDate, LocalDate createdDate, Category category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockQuantity = stockQuantity;
        UpdatedDate = updatedDate;
        CreatedDate = createdDate;
        this.category = category;
    }

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    public int getStockQuantity() {return stockQuantity;}

    public void setStockQuantity(int stockQuantity) {this.stockQuantity = stockQuantity;}

    public Double getPrice() {return price;}

    public void setPrice(Double price) {this.price = price;}

    public LocalDate getCreatedDate() {return CreatedDate;}

    public void setCreatedDate(LocalDate createdDate) {CreatedDate = createdDate;}

    public LocalDate getUpdatedDate() {return UpdatedDate;}

    public void setUpdatedDate(LocalDate updatedDate) {UpdatedDate = updatedDate;}
}
