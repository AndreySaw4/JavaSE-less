package com.company;

public class Vehicle implements IVehicle {

    String name = "default";
   // class Vehicle implements IVehicle;


    @Override
    public void moveToCoordinates(int x, int y) {

    }

    @Override
    public String toString() {
        return "velocity - " + velocity + "\n"
                + "X - " + xCoord + "\n"
                + "Y - " + yCoord + "\n"
                + "Year - " + year + "\n"
                + "Price - " + price + "\n";
    }
}
