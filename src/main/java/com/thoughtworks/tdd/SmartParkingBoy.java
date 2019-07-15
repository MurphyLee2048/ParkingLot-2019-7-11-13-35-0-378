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
        if (firstParkingLot.getRemainingSize() >= secondParkingLot.getRemainingSize()) {
            try {
                return firstParkingLot.park(car);
            } catch (Exception e) {
                if (secondParkingLot == null) {
                    throw e;
                } else {
                    return secondParkingLot.park(car);
                }
            }
        } else {
            try {
                return secondParkingLot.park(car);
            } catch (Exception e) {
                if (firstParkingLot == null) {
                    throw e;
                } else {
                    return firstParkingLot.park(car);
                }
            }
        }
    }

    public int getParkingLotNumber() {
        return 0;
    }
}
