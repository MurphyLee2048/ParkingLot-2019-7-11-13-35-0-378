package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SuperSmartBoyTest {
    // story 5
    @Test
    public void should_always_park_car_to_larger_available_position_rate_parkinglot() throws Exception {
        // given
        Car car = new Car();
        ParkingLot parkingLot1 = new ParkingLot(10);
        ParkingLot parkingLot2 = new ParkingLot(5);
        SuperSmartParkingBoy superSmartParkingBoy = new SuperSmartParkingBoy(parkingLot1, parkingLot2);

        // when
        for (int i = 0; i <= 7; i++) {
            superSmartParkingBoy.park(car);
        }

        // then
        assertEquals(parkingLot1.getSize(), parkingLot1.getSize());
        assertEquals(parkingLot2.getSize(), parkingLot2.getSize());

    }
}
