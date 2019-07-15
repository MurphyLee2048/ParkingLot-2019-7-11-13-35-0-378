package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    // AC1
    @Test
    public void add_ParkingBoy_And_SpecifyOne_to_park() throws Exception {
        Car car = new Car();
        ParkingLot parkingLot = new ParkingLot();
        Manager manager = new Manager();
        ParkingBoy parkingBoy = new ParkingBoy(parkingLot);

        manager.addParkingBoy(parkingBoy);
        Ticket ticket = manager.parkingBoys.get(0).park(car);

        Assertions.assertNotNull(ticket);
    }

    // AC1
    @Test
    public void add_ParkingBoy_And_SpecifyOne_to_fetch() throws Exception {
        Car car = new Car();
        ParkingLot parkingLot = new ParkingLot();
        Manager manager = new Manager();
        ParkingBoy parkingBoy = new ParkingBoy(parkingLot);

        manager.addParkingBoy(parkingBoy);
        Ticket ticket = manager.parkingBoys.get(0).park(car);

        Assertions.assertEquals(car, manager.parkingBoys.get(0).fetch(ticket));
    }


//    // AC2
//    public void
}
