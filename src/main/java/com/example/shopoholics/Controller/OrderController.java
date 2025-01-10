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

import com.example.shopoholics.Entity.Orders;
import com.example.shopoholics.Entity.User;
import com.example.shopoholics.Services.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	OrderService orderService;
	
	 @PostMapping("/one")
	    public Orders createOrder(@RequestBody Orders order){

	       
	        return orderService.saveOrder(order);
	    }

	    @PostMapping("/many")
	    public List<Orders> createAllOrder( @RequestBody List<Orders> orders){
	        return orderService.saveAllOrder(orders);
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Optional<Orders>> getOrderById(@PathVariable long id) {
	        // Call the service to fetch the user
	        Optional<Orders> order = orderService.showUOrderById(id);
	        return ResponseEntity.ok(order);  // 200 OK with the user data
	    }

	    @GetMapping
	    public List<Orders> showAllCategory(){
	        return orderService.showAllOrder();
	    }

	    @DeleteMapping("/{id}")
	    public void deleteOrderById(@PathVariable long id){
	        orderService.deleteOrderById(id);
	    }
	
	
	
	
}
