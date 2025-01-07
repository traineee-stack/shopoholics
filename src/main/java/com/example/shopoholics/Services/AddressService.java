package com.example.shopoholics.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shopoholics.Entity.Address;
import com.example.shopoholics.Repository.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	AddressRepository addressRepo;
	
	 public Address saveAddress(Address address){
	        return addressRepo.save(address);
	    }

	    public List<Address> saveAllAddress(List<Address> address){
	        return addressRepo.saveAll(address);
	    }

	    public Optional<Address> showAddressById(long id){
	        return addressRepo.findById(id);
	    }
	    
	    

	    public List<Address> showAllAddress(){
	        return addressRepo.findAll();
	    }

	    public void deleteAddressById(long id){
	    	addressRepo.deleteById(id);
	    }
	

}
