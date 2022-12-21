package com.hotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages ="com.hotel")
//@EntityScan(basePackages={"Hotel.ManagementRoomEntity,Hotel.ManagementCustomerEntity,Hotel.ManagementRoomReservation"})
//@ComponentScan(basePackages = { "Hotel.ManagementCustomerEntity","Hotel.ManagementRoomEntity","Hotel.ManagementRoomReservation"})
@EnableJpaRepositories(basePackages = "com.hotel.repository")
public class HotelManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelManagementApplication.class, args);
	}

}
