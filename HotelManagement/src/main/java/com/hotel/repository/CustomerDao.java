package com.hotel.repository;


import com.hotel.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDao {

	@Autowired
	CustomerRepository customerRepository;
	

	public String addCustomer(Customer c) {
		customerRepository.save(c);
		return "customer details added successfully";
	}
	
	
    public Customer getCustomerDetail(Long phoneNumber){
		return customerRepository.findByphoneNumber(phoneNumber);
	}
	
	
}
