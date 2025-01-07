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

import com.example.shopoholics.Entity.Address;
import com.example.shopoholics.Services.AddressService;

@RestController
@RequestMapping("/address")
public class AddressContoller {
	
	@Autowired
	private AddressService addressService;
	
	 @PostMapping("/one")
	    public Address createCategory(@RequestBody Address address){

	        return addressService.saveAddress(address);
	    }

	    @PostMapping("/many")
	    public List<Address> createAllAddress( @RequestBody List<Address> addresses){
	        return addressService.saveAllAddress(addresses);
	    }

	    @GetMapping("/{id}")
	    public Optional<Address> showAddressById(@PathVariable long id){
	        return addressService.showAddressById(id);
	    }

	    @GetMapping
	    public List<Address> showAllAddress(){
	        return addressService.showAllAddress();
	    }

	    @DeleteMapping("/{id}")
	    public void deleteAddressById(@PathVariable long id){
	        addressService.deleteAddressById(id);
	    }

}
