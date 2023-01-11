package com.hotel.repository;

import com.hotel.domain.RoomReservation;
import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.domain.Room;

public interface RoomReservationRepository extends JpaRepository<RoomReservation, Integer>{

	//Room findByroomNo(Integer roomNo);

}
