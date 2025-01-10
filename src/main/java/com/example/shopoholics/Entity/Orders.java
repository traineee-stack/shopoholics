package com.example.shopoholics.Entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Orders {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
	@JsonBackReference
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    
    private LocalDateTime orderDate;
    private BigDecimal totalPrice;
    
    private String status;
    private String paymentStatus;
    
    @JsonBackReference("shipping-address")
    @ManyToOne
    @JoinColumn(name = "shipping_address_id")
    private Address shippingAddress;  // Relationship to Address entity
    
    @JsonBackReference("billing-address")
    @ManyToOne
    @JoinColumn(name = "billing_address_id")
    private Address billingAddress;  // Relationship to Address entity

	public Long getId() {
		return id;
	}
	
	//hvh

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Orders(Long id, User user, LocalDateTime orderDate, BigDecimal totalPrice, String status,
			String paymentStatus, Address shippingAddress, Address billingAddress) {
		super();
		this.id = id;
		this.user = user;
		this.orderDate = orderDate;
		this.totalPrice = totalPrice;
		this.status = status;
		this.paymentStatus = paymentStatus;
		this.shippingAddress = shippingAddress;
		this.billingAddress = billingAddress;
	}

	public Orders() {
		
	}
    
    
	
}
