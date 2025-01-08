package com.example.shopoholics.Entity;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderItem {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    @JsonBackReference
	    @ManyToOne
	    @JoinColumn(name = "order_id")
	    private Order order;
	    
	    @JsonBackReference
	    @ManyToOne
	    @JoinColumn(name = "product_id")
	    private Product product;
	    
	    private int quantity;
	    private BigDecimal price;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Order getOrder() {
			return order;
		}
		public void setOrder(Order order) {
			this.order = order;
		}
		public Product getProduct() {
			return product;
		}
		public void setProduct(Product product) {
			this.product = product;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public BigDecimal getPrice() {
			return price;
		}
		public void setPrice(BigDecimal price) {
			this.price = price;
		}
		public OrderItem(Long id, Order order, Product product, int quantity, BigDecimal price) {
			super();
			this.id = id;
			this.order = order;
			this.product = product;
			this.quantity = quantity;
			this.price = price;
		}
		public OrderItem() {
			super();
		}
		
		
	    
	    
}

