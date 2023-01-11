package com.hotel.repository;


import com.hotel.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public class CustomerDao {

	@Autowired
	CustomerRepository customerRepository;
	

	public String addCustomer(Customer c) {
		customerRepository.save(c);
		return "customer details added successfully";
	}
	
	
    public Customer getCustomerDetail(Integer id){
		return customerRepository.findById(id).get();
	}
    
	
	
}
