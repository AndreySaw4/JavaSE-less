package com.company;

public class Ship extends Vehicle{
    int deadweigtht;
    @Override
    public void moveToCoordinates(int x, int y) {

    }

    @Override
    public String toString() {
        return "The ship - " + super.name + "\n" + super.toString() + "deadweigtht - " + deadweigtht + "\n";
    }

    public int getDeadweigtht() {
        return deadweigtht;
    }

    public void setDeadweigtht(int deadweigtht) {
        this.deadweigtht = deadweigtht;
    }
}
