package com.thoughtworks.tdd;

import java.util.HashMap;

public class ParkingLot {
    private HashMap<Ticket, Car> parkedCarTicket = new HashMap<>(10);
    // 应由停车场来保管car和ticket
    private Car car;
    private Ticket ticket;

    public Ticket park(Car car) throws Exception {
        if (parkedCarTicket.size() >= 10) {
            throw new Exception("parkinglot is full right now!");
        }
        Ticket ticket = new Ticket();
        parkedCarTicket.put(ticket, car);  // 停车入场， ticket和car一一对应
        return ticket;  // 返票给parkingboy
    }


    public Car fetch(Ticket ticket) throws Exception {
        if(!parkedCarTicket.containsKey(ticket))
            throw new Exception("Wrong Ticket");

        return parkedCarTicket.remove(ticket);  // 删除记录
    }
}