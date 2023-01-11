package com.hotel.controller;

import com.hotel.domain.Customer;
import com.hotel.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/Customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerser;
	
	@PostMapping(value="/addCustomer")
	public String addCustomer(@RequestBody Customer c) {
		return customerser.addCustomer(c);
	}
	
	@GetMapping(value="/customerDetails")
    public Customer getCustomerDetail(@PathVariable Integer id){
		return customerser.getCustomerDetail(id);
	}
	
}
