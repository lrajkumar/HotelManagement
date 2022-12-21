package com.hotel.repository;

import com.hotel.domain.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Integer>{

	Room findByroomNo(Integer roomNo);

	void findByroomNo(Room e);

	

	String deleteByroomNo(Integer roomNo);
	

}
