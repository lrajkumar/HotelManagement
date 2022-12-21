package Hotel.ManagementRoomReservation;

import org.springframework.data.jpa.repository.JpaRepository;

import Hotel.ManagementRoomEntity.RoomEntity;

public interface RoomReservationRepository extends JpaRepository<RoomReservationEntity, Integer>{

	RoomEntity findByroomNo(Integer roomNo);

}
