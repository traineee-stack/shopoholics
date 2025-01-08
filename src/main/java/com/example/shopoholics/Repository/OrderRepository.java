package com.example.shopoholics.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.shopoholics.Entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
