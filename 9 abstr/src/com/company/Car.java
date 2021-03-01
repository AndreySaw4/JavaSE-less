package com.company;

public class Car extends Vehicle {
    int tonnage = 0;

    @Override
    public void moveToCoordinates(int x, int y) {
        super.moveToCoordinates(x, y);
    }

    @Override
    public String toString() {
        return "The car - " + super.name + "\n"  + super.toString() + "tonnage - " + tonnage + "\n";
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }
}
