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
	
    public Room getRoomDetail(Integer id){
    	return roomrepo.findById(id).get();	
	}
			
   
    public String updateRoomDetails(Room e)  {
    	roomrepo.save(e).getId();
    	return "Rooms updated successfully";
    }
   
    public String deleteRoomDetails(Integer id) {
			 roomrepo.deleteById(id);
			 return "RoomDetails detailed Successfully";
		}
}
