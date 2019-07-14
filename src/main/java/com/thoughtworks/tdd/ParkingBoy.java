package com.thoughtworks.tdd;


public class ParkingBoy {
    private ParkingLot firstParkingLot;
    private ParkingLot secondParkingLot;

    public ParkingBoy(ParkingLot firstParkingLot) {
        this.firstParkingLot = firstParkingLot;
    }

    public ParkingBoy(ParkingLot firstParkingLot, ParkingLot secondParkingLot) {
        this.firstParkingLot = firstParkingLot;
        this.secondParkingLot = secondParkingLot;
    }

    public Ticket park(Car car) throws Exception {
        Ticket ticket;

        try {
            ticket = firstParkingLot.park(car);
        } catch (Exception e) {
            if (secondParkingLot == null) {
                throw e;
            }else {
                return secondParkingLot.park(car);
            }
        }
        return ticket;
    }

    public Car fetch(Ticket ticket) throws Exception {
        Car car;
        try {
            car = firstParkingLot.fetch(ticket);
        }catch (Exception e) {
            if (secondParkingLot == null) {
                throw e;
            }else {
                return secondParkingLot.fetch(ticket);
            }
        }
        return car;
    }
}