package com.example.shopoholics.Services;

import com.example.shopoholics.Entity.Category;
import com.example.shopoholics.Repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    public Category saveCategory(Category category){
        return categoryRepo.save(category);
    }

    public List<Category> saveAllCategory(List<Category> category){
        return categoryRepo.saveAll(category);
    }

    public Optional<Category> showCategoryById(long id){
        return categoryRepo.findById(id);
    }

    public List<Category> showAllCategory(){
        return categoryRepo.findAll();
    }

    public void deleteCategoryById(long id){
        categoryRepo.deleteById(id);
    }
}
