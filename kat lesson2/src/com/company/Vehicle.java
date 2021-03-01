package com.company;

public class Vehicle {
    private int coordX;
    private int coordY;
    private String name;
    private int price;
    private int speed;
    private int year;


    public Vehicle(int x, int y, String name, int price, int speed, int year) {
        this.name = name;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "coordX=" + coordX +
                ", coordY=" + coordY +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", speed=" + speed +
                ", year=" + year +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
