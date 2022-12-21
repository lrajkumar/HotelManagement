package com.hotel.service;

import com.hotel.domain.Room;
import com.hotel.repository.RoomDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService {
	@Autowired
    RoomDao roomdao;
	
	
	public String addRoom( Room e) {
		return roomdao.addRoom(e);
	}
	

    public Room getRoomDetail(Integer roomNo){
		return roomdao.getRoomDetail(roomNo);
	}
			
   
    public String updateRoomDetails(Room e)  {
    	return roomdao.updateRoomDetails(e);
    }
   
    public String deleteRoomDetails(Integer roomNo) {
			return roomdao.deleteRoomDetails(roomNo);
		}
	
}
