package com.hotel.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="reservation_details")
public class RoomReservation extends BaseEntity {

	@OneToOne
	private Customer customer;
	
	@OneToOne
	private Room room;

	private int days;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public int getTotalPrice() {
		return (int) ((days * room.getPrice()) * 0.5);
	}
	

}
