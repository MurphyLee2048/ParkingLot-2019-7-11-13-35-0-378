package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertSame;

public class ParkingBoyTest {

    //AC1
    @Test
    public void should_return_ticket_when_give_car() {
        //given
        Car car = new Car();
        ParkingLot parkingLot = new ParkingLot();
        ParkingBoy parkingBoy = new ParkingBoy(parkingLot);


        //when
        Ticket ticket = parkingBoy.park(car);


        //then
        Assertions.assertNotNull(ticket);

    }

    //AC1
    @Test
    public void should_return_when_park_car_to_parking_lot_then_get_it_back() throws Exception {
        //given
        Car car = new Car();
        ParkingLot parkingLot = new ParkingLot();
        ParkingBoy parkingBoy = new ParkingBoy(parkingLot);


        //when
        Ticket ticket = parkingBoy.park(car);

        Car fetchCar = parkingBoy.fetch(ticket);


        //then
        assertSame(car, fetchCar);

    }


    //AC2
    @Test
    public void should_multiple_cars_when_park_to_parking_lot_then_get_them_back() throws Exception {
        //given

        Car firstCar = new Car();
        Car secondCar = new Car();

        ParkingLot parkingLot = new ParkingLot();
        ParkingBoy parkingBoy = new ParkingBoy(parkingLot);


        //when
        Ticket firstTicket = parkingBoy.park(firstCar);
        Car fetchFirstCar = parkingBoy.fetch((firstTicket));


        Ticket secondTicket = parkingBoy.park(secondCar);
        Car fetchSecondCar = parkingBoy.fetch((secondTicket));


        //then

        assertSame(firstCar, fetchFirstCar);
        assertSame(secondCar, fetchSecondCar);
    }


    //AC3
    @Test
    public void should_not_featch_car_when_ticket_is_wrong() {
        //given
        Car car = new Car();
        ParkingLot parkingLot = new ParkingLot();
        ParkingBoy parkingBoy = new ParkingBoy(parkingLot);


        //when

        Ticket wrongTicket = new Ticket();


        //then

//        final Exception exception = Assertions.assertThrows(Exception.class);
        Assertions.assertThrows(Exception.class, () -> {
            parkingBoy.fetch(wrongTicket);
        });
    }

    //AC3
    @Test
    public void should_not_featch_car_when_ticket_is_null() {
        //given
        Car car = new Car();
        ParkingLot parkingLot = new ParkingLot();
        ParkingBoy parkingBoy = new ParkingBoy(parkingLot);


        //when

        Ticket wrongTicket = null;


        //then

//        final Exception exception = Assertions.assertThrows(Exception.class);
        Assertions.assertThrows(Exception.class, () -> {
            parkingBoy.fetch(wrongTicket);
        });
    }

    //AC4
    @Test
    public void should_not_fetch_car_when_ticket_is_already_used() throws Exception {
        //given
        Car car = new Car();
        ParkingLot parkingLot = new ParkingLot();
        ParkingBoy parkingBoy = new ParkingBoy(parkingLot);

        //when
        Ticket ticket = parkingBoy.park(car);
        Car fetchedCar = parkingBoy.fetch(ticket);

        //then
        Assertions.assertThrows(Exception.class, () -> {
            parkingBoy.fetch(ticket);
        });
    }

    //AC5
    @Test
    public void should_not_park_car_when_parkinglot_is_full() throws Exception{
        //given
        ParkingLot parkingLot = new ParkingLot();
        ParkingBoy parkingBoy = new ParkingBoy(parkingLot);

        //when
        for (int i = 0; i < 10; i++) {
            parkingBoy.park(new Car());
        }

        //then
        Assertions.assertThrows(Exception.class, () -> {
            parkingBoy.park(new Car());
        });
    }

}

