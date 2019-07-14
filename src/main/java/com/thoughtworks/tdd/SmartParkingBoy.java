package com.thoughtworks.tdd;

import java.util.Arrays;
import java.util.Comparator;

public class SmartParkingBoy extends ParkingBoy {
    private ParkingLot[] parkingLots;

    public SmartParkingBoy(ParkingLot[] parkingLots) {
        super(parkingLots);
        this.parkingLots = parkingLots;
    }

    public SmartParkingBoy(ParkingLot firstParkingLot, ParkingLot secondParkingLot) {
        super(firstParkingLot, secondParkingLot);
    }

    @Override
    public Ticket park(Car car) throws Exception {
        ParkingLot parkingLot = Arrays.stream(parkingLots)
                .max(Comparator.comparing(ParkingLot::getSize))
                .get();  // optional => parkinglot

        return parkingLot.park(car);
    }

    public int getParkingLotNumber() {
        return 0;
    }
}
