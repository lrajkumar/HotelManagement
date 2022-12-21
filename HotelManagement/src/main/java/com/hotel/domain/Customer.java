package com.hotel.domain;

import jakarta.persistence.*;

@Entity
@Table(name="Customer_details")
public class Customer extends BaseEntity {
    private String customerName;
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
