package com.hotel.domain;

import jakarta.persistence.*;

@Entity
@Table(name="customer_details")
public class Customer extends BaseEntity {
	
	//@Column(name = "customer_name")
    private String customerName;
	
	//@Column(name ="phone_number")
    private long phoneNumber;
   
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
    
    
}
