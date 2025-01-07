package com.example.shopoholics.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shopoholics.Entity.User;
import com.example.shopoholics.Repository.UserRepository;

@Service
public class UserService {
	
    @Autowired
    private UserRepository userRepo;

    public User saveUser(User user){
        return userRepo.save(user);
    }

    public List<User> saveAllUser(List<User> user){
        return userRepo.saveAll(user);
    }

    public Optional<User> showUserById(long id){
        return userRepo.findById(id);
    }
    
    

    public List<User> showAllUser(){
        return userRepo.findAll();
    }

    public void deleteUserById(long id){
    	userRepo.deleteById(id);
    }

}
