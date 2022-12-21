package Hotel.ManagementRoomReservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Hotel.ManagementRoomEntity.RoomEntity;
import Hotel.ManagementRoomEntity.RoomService;

@RestController
@RequestMapping(value="/RoomReservation")
public class RoomReservationController {

	@Autowired 
	RoomReservationService roomreservationser;
	
	@PostMapping(value="/addRoomReservation")
	public String addRoomReservation(@RequestBody RoomReservationEntity r) {
		return roomreservationser.addRoomReservation(r);
	}
	
	@GetMapping(value="/getRoomDetails/{roomNo}")
    public RoomEntity getRoomDetail(@RequestParam Integer roomNo){
		return roomreservationser.getRoomDetail(roomNo);
	}
	
	
}
