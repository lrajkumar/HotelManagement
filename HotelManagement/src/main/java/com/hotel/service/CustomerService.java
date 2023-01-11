package com.hotel.service;

import com.hotel.domain.Customer;
import com.hotel.repository.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	@Autowired
    CustomerDao customerdao;

	public String addCustomer(Customer c) {
		return customerdao.addCustomer(c);
	}

    public Customer getCustomerDetail(Integer id){
		return customerdao.getCustomerDetail(id);
	
}
    
}
