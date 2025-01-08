package com.example.shopoholics.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shopoholics.Entity.Order;
import com.example.shopoholics.Entity.User;
import com.example.shopoholics.Exception.ResourceNotFoundException;
import com.example.shopoholics.Repository.OrderRepository;
import com.example.shopoholics.Repository.UserRepository;

@Service
public class OrderService {
	
	@Autowired
    private OrderRepository orderRepository;

    public Order saveOrder(Order order){
        return orderRepository.save(order);
    }

    public List<Order> saveAllOrder(List<Order> order){
        return orderRepository.saveAll(order);
    }

    public Optional<Order> showUOrderById(long id) {
        Optional<Order> order = orderRepository.findById(id);
        if (order.isEmpty()) {
            throw new ResourceNotFoundException("User not found with id: " + id);
        }
        return order;
    }
    

    public List<Order> showAllOrder(){
        return orderRepository.findAll();
    }

    public void deleteOrderById(long id){
    	orderRepository.deleteById(id);
    }

	
}
