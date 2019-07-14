package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmartParkingBoyTest {

    // story4
    @Test
    public void should_always_park_car_to_avaliable_parkinglot() throws Exception {
        // given
        Car car1 = new Car();
        Car car2 = new Car();
        ParkingLot parkingLot1 = new ParkingLot();
        ParkingLot parkingLot2 = new ParkingLot();
        SmartParkingBoy smartParkingBoy = new SmartParkingBoy(parkingLot1, parkingLot2);


        // when
        smartParkingBoy.park(car1);
        smartParkingBoy.park(car1);


        // then
        // expect both have one car parked
        assertEquals(9, parkingLot1.getSize());
        assertEquals(9, parkingLot2.getSize());

    }
}
