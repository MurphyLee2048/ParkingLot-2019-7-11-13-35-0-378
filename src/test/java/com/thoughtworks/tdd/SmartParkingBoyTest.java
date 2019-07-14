package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmartParkingBoyTest {

    // story4
    @Test
    public void should_always_park_car_to_avaliable_parkinglot() throws Exception {
        // given
        Car car = new Car();
        ParkingLot parkingLot = new ParkingLot();
        SmartParkingBoy smartParkingBoy = new SmartParkingBoy(parkingLot);


        // when
        smartParkingBoy.park(car);
        int parkingLotNumber = smartParkingBoy.park(new Car()).getParkingLotNumber();

        // then
        assertEquals(2, parkingLotNumber);

    }
}
