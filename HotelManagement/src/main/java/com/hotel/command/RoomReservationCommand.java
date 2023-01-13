package com.hotel.command;

import org.hibernate.annotations.Formula;

public class RoomReservationCommand {

	
	@Formula("(select room_id from room_details where roomreservation_details.roomNo=room_details.id)")
	private int roomNo;
	private int customerId;
	private int days;

	
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getDays() {
		return days;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setDays(int days) {
		this.days = days;
	}
}

