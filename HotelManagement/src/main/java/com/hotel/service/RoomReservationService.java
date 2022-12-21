package com.hotel.service;



import com.hotel.domain.RoomReservation;
import com.hotel.repository.RoomReservationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.domain.Room;

@Service
public class RoomReservationService {

	@Autowired
	RoomReservationDao roomreservationdao;
	
	
	public String addRoomReservation(RoomReservation r) {
		return roomreservationdao.addRoomReservation(r);
	}
	
	
    public Room getRoomDetail(Integer roomNo){
		return roomreservationdao.getRoomDetail(roomNo);
	}
	
	
	
	
	
}
