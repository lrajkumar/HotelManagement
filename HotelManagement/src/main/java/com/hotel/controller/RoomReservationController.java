package com.hotel.controller;

import com.hotel.domain.RoomReservation;
import com.hotel.service.CustomerService;
import com.hotel.service.RoomReservationService;
import com.hotel.service.RoomService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.command.RoomReservationCommand;
import com.hotel.domain.Customer;
import com.hotel.domain.Room;

@RestController
@RequestMapping(value="/RoomReservation")
public class RoomReservationController {

	@Autowired
	RoomReservationService roomreservationser;
	@Autowired
	private RoomService roomService;
	@Autowired
	private CustomerService customerService;
	
	@PostMapping(value="/addRoomReservation")
	public String addRoomReservation(@RequestBody RoomReservationCommand command) {
		Room room = roomService.getRoomDetail(command.getRoomNo());
		Customer customer=customerService.getCustomerDetail(command.getCustomerId());
		
		RoomReservation reservation = new RoomReservation();
		reservation.setRoom(room);
		reservation.setCustomer(customer);
		reservation.setDays(command.getDays());
		
		return roomreservationser.addRoomReservation(reservation);
	}
	
	@GetMapping(value="/getRoomDetails/{id}")
    public RoomReservation getRoomReservationDetail(@PathVariable Integer id){
		return roomreservationser.getRoomReservationDetail(id);
	}
	
	
}
