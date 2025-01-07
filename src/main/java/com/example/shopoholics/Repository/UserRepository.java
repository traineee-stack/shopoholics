package com.example.shopoholics.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.shopoholics.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
