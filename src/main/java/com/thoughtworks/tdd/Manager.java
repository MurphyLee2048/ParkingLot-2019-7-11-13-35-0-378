package com.thoughtworks.tdd;

import java.util.ArrayList;
import java.util.List;

public class Manager extends ParkingBoy {
    protected List<ParkingBoy> parkingBoys = new ArrayList<>();

    public void addParkingBoy(ParkingBoy parkingBoy) {
        parkingBoys.add(parkingBoy);
    }
}
