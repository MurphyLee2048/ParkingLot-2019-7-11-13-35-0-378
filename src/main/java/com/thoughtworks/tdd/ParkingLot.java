package com.thoughtworks.tdd;

import java.util.HashMap;

public class ParkingLot {
    private HashMap<Ticket, Car> parkedCarTicket = new HashMap<>(10);
    // 应由停车场来保管car和ticket
    private Car car;
    private Ticket ticket;
    private int capacity;

    public ParkingLot() {

    }

    public ParkingLot(int capacity) {
        this.capacity = capacity;
    }

    public Ticket park(Car car) throws Exception {
        if (parkedCarTicket.size() >= 10) {
            throw new Exception("Not enough position.");
        }
        Ticket ticket = new Ticket();
        parkedCarTicket.put(ticket, car);  // 停车入场， ticket和car一一对应
        return ticket;  // 返票给parkingboy
    }

    public Car fetch(Ticket ticket) throws Exception {
        if (ticket == null) {
            throw new Exception("Please provide your parking ticket.");
        }
        if(!parkedCarTicket.containsKey(ticket)) {
            throw new Exception("Unrecognized parking ticket.");
        }
        return parkedCarTicket.remove(ticket);  // 删除记录
    }

    public int getSize() {
        return parkedCarTicket.size();
    }

    public int getRemainingSize() {return capacity - parkedCarTicket.size();}
}