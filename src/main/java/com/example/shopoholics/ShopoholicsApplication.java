package com.example.shopoholics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EntityScan(basePackages = "com.example.shopoholics.Entity")
@ComponentScan(basePackages = "com.example.shopoholics")
public class ShopoholicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopoholicsApplication.class, args);
		System.out.println("nitu");

	}
}
