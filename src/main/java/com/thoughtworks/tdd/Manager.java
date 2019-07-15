package com.thoughtworks.tdd;

import java.util.ArrayList;
import java.util.List;

public class Manager extends ParkingBoy {
    protected List<ParkingBoy> parkingBoys = new ArrayList<>();

    public void addParkingBoy(ParkingBoy parkingBoy) {
        parkingBoys.add(parkingBoy);

    }

    @Override
    public Ticket park(Car car) throws Exception{
        return parkingBoys.get(0).park(car);
    }


    @Override
    public Car fetch(Ticket ticket) throws Exception{
        return parkingBoys.get(0).fetch(ticket);
    }
}
