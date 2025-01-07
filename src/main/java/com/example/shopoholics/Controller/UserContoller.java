package com.example.shopoholics.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.shopoholics.Entity.User;
import com.example.shopoholics.Services.UserService;

@RestController
@RequestMapping("/user") 
public class UserContoller {
	
	 @Autowired
	    private UserService userService;

	    @PostMapping("/one")
	    public User createUser(@RequestBody User user){

	       
	        return userService.saveUser(user);
	    }

	    @PostMapping("/many")
	    public List<User> createAllUser( @RequestBody List<User> users){
	        return userService.saveAllUser(users);
	    }

	    @GetMapping("/{id}")
	    public Optional<User> showUserById(@PathVariable long id){
	        return userService.showUserById(id);
	    }

	    @GetMapping
	    public List<User> showAllCategory(){
	        return userService.showAllUser();
	    }

	    @DeleteMapping("/{id}")
	    public void deleteUserById(@PathVariable long id){
	        userService.deleteUserById(id);
	    }
	
	
	
	

}
