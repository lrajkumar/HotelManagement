package com.hotel.controller;

import com.hotel.domain.RoomReservation;
import com.hotel.service.RoomReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.domain.Room;

@RestController
@RequestMapping(value="/RoomReservation")
public class RoomReservationController {

	@Autowired
	RoomReservationService roomreservationser;
	
	@PostMapping(value="/addRoomReservation")
	public String addRoomReservation(@RequestBody RoomReservation r) {
		return roomreservationser.addRoomReservation(r);
	}
	
	@GetMapping(value="/getRoomDetails/{roomNo}")
    public Room getRoomDetail(@RequestParam Integer roomNo){
		return roomreservationser.getRoomDetail(roomNo);
	}
	
	
}
