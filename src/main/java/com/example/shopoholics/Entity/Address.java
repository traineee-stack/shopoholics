package com.example.shopoholics.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Address {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
	@JsonBackReference
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    
    private String street;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    
    private String type; // 'shipping' or 'billing'
    
    @OneToMany(mappedBy = "shippingAddress")  // Mapping to Orders where this address is used as shipping
    @JsonManagedReference // Avoid infinite recursion in serialization
    private List<Orders> shippingOrders;

    @OneToMany(mappedBy = "billingAddress")  // Mapping to Orders where this address is used as billing
    @JsonManagedReference  // Avoid infinite recursion in serialization
    private List<Orders> billingOrders;

	public Long getId() {
		return id;
	}

	

	public List<Orders> getShippingOrders() {
		return shippingOrders;
	}

	public void setShippingOrders(List<Orders> shippingOrders) {
		this.shippingOrders = shippingOrders;
	}

	public List<Orders> getBillingOrders() {
		return billingOrders;
	}

	public void setBillingOrders(List<Orders> billingOrders) {
		this.billingOrders = billingOrders;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	

	public Address(Long id, User user, String street, String city, String state, String postalCode, String country,
			String type, List<Orders> shippingOrders, List<Orders> billingOrders) {
		super();
		this.id = id;
		this.user = user;
		this.street = street;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.country = country;
		this.type = type;
		this.shippingOrders = shippingOrders;
		this.billingOrders = billingOrders;
	}



	public Address() {
		super();
	}
    
    
    
    
	
	
}
