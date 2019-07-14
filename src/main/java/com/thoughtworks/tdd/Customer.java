package com.thoughtworks.tdd;


public class Customer {
    private Car car;
    private ParkingBoy parkingBoy;
    private Ticket ticket;

    public void park(Car car) throws Exception{
        this.ticket = parkingBoy.park(car);
    }

    public void fetch() {



    }
}
