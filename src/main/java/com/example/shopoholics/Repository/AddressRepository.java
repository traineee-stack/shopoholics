package com.example.shopoholics.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.shopoholics.Entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
