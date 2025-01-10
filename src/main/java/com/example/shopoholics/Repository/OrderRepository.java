package com.example.shopoholics.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.shopoholics.Entity.Orders;

public interface OrderRepository extends JpaRepository<Orders, Long> {

}
