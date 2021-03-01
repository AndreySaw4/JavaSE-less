package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

//         System.out.println("Test");

    Vehicle v1 = new Vehicle(0,0,"Car1", 100500, 233, 2021); // name, price, speed, year
    Vehicle v2 = new Vehicle(0,0,"Car2", 34322, 233, 3215); // name, price, speed, year
    System.out.print(v1.toString());
    System.out.println();
    System.out.print(v2.toString());

    Ship s1 = new Ship(0,0,"Car1", 100500, 233, 2021, "gdyhdf", 123);

        System.out.print(s1.toString());

    }
}
