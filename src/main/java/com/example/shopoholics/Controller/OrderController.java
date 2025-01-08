package com.example.shopoholics.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.shopoholics.Entity.Order;
import com.example.shopoholics.Entity.User;
import com.example.shopoholics.Services.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	OrderService orderService;
	
	 @PostMapping("/one")
	    public Order createOrder(@RequestBody Order order){

	       
	        return orderService.saveOrder(order);
	    }

	    @PostMapping("/many")
	    public List<Order> createAllOrder( @RequestBody List<Order> orders){
	        return orderService.saveAllOrder(orders);
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Optional<Order>> getOrderById(@PathVariable long id) {
	        // Call the service to fetch the user
	        Optional<Order> order = orderService.showUOrderById(id);
	        return ResponseEntity.ok(order);  // 200 OK with the user data
	    }

	    @GetMapping
	    public List<Order> showAllCategory(){
	        return orderService.showAllOrder();
	    }

	    @DeleteMapping("/{id}")
	    public void deleteOrderById(@PathVariable long id){
	        orderService.deleteOrderById(id);
	    }
	
	
	
	
}
