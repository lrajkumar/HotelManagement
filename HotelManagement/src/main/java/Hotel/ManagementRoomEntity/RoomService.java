package Hotel.ManagementRoomEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RequestBody;

@Service
public class RoomService {
	@Autowired
	RoomDao roomdao;
	
	
	public String addRoom( RoomEntity e) {
		return roomdao.addRoom(e);
	}
	

    public RoomEntity getRoomDetail(Integer roomNo){
		return roomdao.getRoomDetail(roomNo);
	}
			
   
    public String updateRoomDetails(RoomEntity e)  {
    	return roomdao.updateRoomDetails(e);
    }
   
    public String deleteRoomDetails(Integer roomNo) {
			return roomdao.deleteRoomDetails(roomNo);
		}
	
}
