package com.example.shopoholics.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime paymentDate;
    private String paymentStatus;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    public Payment() {
    }

    public Payment(Long id, LocalDateTime paymentDate, String paymentStatus, Order order) {
        this.id = id;
        this.paymentDate = paymentDate;
        this.paymentStatus = paymentStatus;
        this.order = order;
    }

    public Order getOrder() {return order;}

    public void setOrder(Order order) {this.order = order;}

    public String getPaymentStatus() {return paymentStatus;}

    public void setPaymentStatus(String paymentStatus) {this.paymentStatus = paymentStatus;}

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public LocalDateTime getPaymentDate() {return paymentDate;}

    public void setPaymentDate(LocalDateTime paymentDate) {this.paymentDate = paymentDate;}

}
