package com.hotel.repository;

import com.hotel.domain.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public class RoomDao {
	
	@Autowired
	RoomRepository roomrepo;
	public String addRoom(Room e) {
		 roomrepo.save(e);
		 return "room added successfully";
	}
	
    public Room getRoomDetail(Integer roomNo){
    	return roomrepo.findByroomNo(roomNo);	
	}
			
   
    public String updateRoomDetails(@RequestBody Room e)  {
    	roomrepo.findByroomNo(e);
    	return "Rooms updated successfully";
    }
   
    public String deleteRoomDetails(Integer roomNo) {
			 roomrepo.deleteByroomNo(roomNo);
			 return "RoomDetails detailed Successfully";
		}
}
