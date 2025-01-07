package com.example.shopoholics.Repository;

import com.example.shopoholics.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories("com.example.shopoholics.Repository")
public interface CategoryRepo extends JpaRepository<Category,Long> {

}
