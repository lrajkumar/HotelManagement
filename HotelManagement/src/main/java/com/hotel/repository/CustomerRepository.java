package com.hotel.repository;

import com.hotel.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer,Long> {

	Customer findByphoneNumber(Long phoneNumber);

}
