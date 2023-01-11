package com.hotel.repository;

import com.hotel.domain.BaseEntity;
import com.hotel.domain.Customer;


import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer,Integer> {

	//Optional<Customer> findById(Integer id);

	//BaseEntity findById(Integer id);

	//Customer findByphoneNumber(Long phoneNumber);

}
