package com.hotel.controller;

import com.hotel.domain.Room;
import com.hotel.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/Room")
public class RoomController {

	@Autowired
	RoomService roomser;
	
	@PostMapping(value="/addRoom")
	public String addRoom(@RequestBody Room e) {
		return roomser.addRoom(e);
	}
	
	@GetMapping(value="/getRoomDetails/{roomNo}")
    public Room getRoomDetail(@RequestParam Integer roomNo){
		return roomser.getRoomDetail(roomNo);
	}
			
    @PutMapping(value="/updateRoomDetails/{roomNo}")
    public String updateRoomDetails(@RequestBody Room e)  {
    	return roomser.updateRoomDetails(e);
    }
   
	@DeleteMapping(value="/deleteRoomDEtails/{roomNo}")
		public String deleteRoomDetails(@RequestParam Integer roomNo) {
			return roomser.deleteRoomDetails(roomNo);
		}
	}

