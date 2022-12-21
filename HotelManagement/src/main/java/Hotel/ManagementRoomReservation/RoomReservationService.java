package Hotel.ManagementRoomReservation;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import Hotel.ManagementRoomEntity.RoomEntity;

@Service
public class RoomReservationService {

	@Autowired 
	RoomReservationDao roomreservationdao;
	
	
	public String addRoomReservation(RoomReservationEntity r) {
		return roomreservationdao.addRoomReservation(r);
	}
	
	
    public RoomEntity getRoomDetail(Integer roomNo){
		return roomreservationdao.getRoomDetail(roomNo);
	}
	
	
	
	
	
}
