package Hotel.ManagementRoomEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<RoomEntity, Integer>{

	RoomEntity findByroomNo(Integer roomNo);

	void findByroomNo(RoomEntity e);

	

	String deleteByroomNo(Integer roomNo);
	

}
