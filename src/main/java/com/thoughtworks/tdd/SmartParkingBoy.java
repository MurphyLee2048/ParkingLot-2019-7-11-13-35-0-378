package com.thoughtworks.tdd;

public class SmartParkingBoy extends ParkingBoy {
    public SmartParkingBoy(ParkingLot firstParkingLot) {
        super(firstParkingLot);
    }

    public SmartParkingBoy(ParkingLot firstParkingLot, ParkingLot secondParkingLot) {
        super(firstParkingLot, secondParkingLot);
    }

    @Override
    public Ticket park(Car car) throws Exception {
        return super.park(car);
    }

    public int getParkingLotNumber() {
        return 0;
    }
}
