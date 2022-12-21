package com.hotel.repository;


import com.hotel.domain.RoomReservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hotel.domain.Room;

@Repository
public class RoomReservationDao {

	
	
	
	@Autowired 
	RoomReservationRepository roomreservationrepo;
	
	
	public String addRoomReservation(RoomReservation r) {
		roomreservationrepo.save(r);
		return "roomReservation details added";
	}
	
	
    public Room getRoomDetail(Integer roomNo){
		return roomreservationrepo.findByroomNo(roomNo);
	}
}
