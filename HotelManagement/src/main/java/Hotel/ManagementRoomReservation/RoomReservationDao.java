package Hotel.ManagementRoomReservation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import Hotel.ManagementRoomEntity.RoomEntity;

@Repository
public class RoomReservationDao {

	
	
	
	@Autowired 
	RoomReservationRepository roomreservationrepo;
	
	
	public String addRoomReservation(RoomReservationEntity r) {
		roomreservationrepo.save(r);
		return "roomReservation details added";
	}
	
	
    public RoomEntity getRoomDetail(Integer roomNo){
		return roomreservationrepo.findByroomNo(roomNo);
	}
}
