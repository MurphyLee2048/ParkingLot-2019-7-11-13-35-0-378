package com.thoughtworks.tdd;

public class SuperSmartParkingBoy extends ParkingBoy{
    public SuperSmartParkingBoy(ParkingLot firstParkingLot, ParkingLot secondParkingLot) {
        super(firstParkingLot, secondParkingLot);
    }

    @Override
    public Ticket park(Car car) throws Exception{
        if (firstParkingLot.getRemainingSize() / firstParkingLot.getCapacity() >= secondParkingLot.getRemainingSize() / secondParkingLot.getCapacity()) {
            try {
                return firstParkingLot.park(car);
            }catch (Exception e) {
                if (secondParkingLot == null) {
                    throw e;
                }else {
                    return secondParkingLot.park(car);
                }
            }
        }else {
            try {
                return secondParkingLot.park(car);
            }catch (Exception e) {
                if (firstParkingLot == null) {
                    throw e;
                }else {
                    return firstParkingLot.park(car);
                }
            }
        }
    }
}
