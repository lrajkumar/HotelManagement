package Hotel.ManagementRoomEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public class RoomDao {
	
	@Autowired
	RoomRepository roomrepo;
	public String addRoom(RoomEntity e) {
		 roomrepo.save(e);
		 return "room added successfully";
	}
	
    public RoomEntity getRoomDetail(Integer roomNo){
    	return roomrepo.findByroomNo(roomNo);	
	}
			
   
    public String updateRoomDetails(@RequestBody RoomEntity e)  {
    	roomrepo.findByroomNo(e);
    	return "Rooms updated successfully";
    }
   
    public String deleteRoomDetails(Integer roomNo) {
			 roomrepo.deleteByroomNo(roomNo);
			 return "RoomDetails detailed Successfully";
		}
}
