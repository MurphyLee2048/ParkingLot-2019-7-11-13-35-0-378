package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmartParkingBoyTest {

    // story4
    @Test
    public void should_always_park_car_to_avaliable_parkinglot() throws Exception {
        // given
        Car car = new Car();
        ParkingLot parkingLot1 = new ParkingLot(10);
        ParkingLot parkingLot2 = new ParkingLot(9);
        SmartParkingBoy smartParkingBoy = new SmartParkingBoy(parkingLot1, parkingLot2);


        // when
        smartParkingBoy.park(car);

        // then
        // expect both have one car parked
        assertEquals(1, parkingLot1.getSize());
        assertEquals(0, parkingLot2.getSize());

    }
}
