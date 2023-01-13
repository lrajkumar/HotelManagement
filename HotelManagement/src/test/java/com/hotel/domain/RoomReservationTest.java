package com.hotel.domain;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

class RoomReservationTest {

    @Test
    void getTotalPrice() {
        Room room = new Room();
        room.setId(1);
        room.setRoomNo(101);
        room.setRoomType("Normal");
        room.setPrice(1000);

        Customer customer = new Customer();
        customer.setId(1);
        customer.setCustomerName("Raj");
        customer.setPhoneNumber(123456789);

        RoomReservation roomReservation = new RoomReservation();
        roomReservation.setId(1);
        roomReservation.setRoom(room);
        roomReservation.setCustomer(customer);
        roomReservation.setDays(2);

        MatcherAssert.assertThat("total price", roomReservation.getTotalPrice(), Matchers.is(2000));

    }

}