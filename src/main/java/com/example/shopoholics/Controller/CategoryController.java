package com.example.shopoholics.Controller;

import com.example.shopoholics.Entity.Category;
import com.example.shopoholics.Services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/category")
public class CategoryController {

    @GetMapping("/hello")
    public String sayHello()
    {
        return "hello";
    }

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/one")
    public Category createCategory(@RequestBody Category category){

       // System.out.println("Received Category: " + category);
        return categoryService.saveCategory(category);

    }



        @PostMapping("/many")
    public List<Category> createAllCategory( @RequestBody List<Category> categories){
        return categoryService.saveAllCategory(categories);
    }

    @GetMapping("/{id}")
    public Optional<Category> showCategoryById(@PathVariable long id){
        return categoryService.showCategoryById(id);
    }

    @GetMapping
    public List<Category> showAllCategory(){
        return categoryService.showAllCategory();
    }

    @DeleteMapping("/{id}")
    public void deleteCategoryById(@PathVariable long id){
        categoryService.deleteCategoryById(id);
    }

}

