package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here


        // class Vehicle implements IVehicle{


        //  Vehicle v11 = new Vehicle();
        //  System.out.println(v11.toString());//

        //   Ship ship1 = new Ship();
        //  System.out.println(ship1.toString());//

        //Car car1 = new Car();
        //  System.out.println(car1.toString());//
        // }

        Garage g_1 = new Garage(new Ship(), new Car(), new Car(), new Car(), new Car(), new Car(), new Car(), new Car(), new Car());
        g_1.goGo();

        System.out.println("----------------------\n");
        System.out.println(g_1.getByType("Plane"));
        ///Garage gar = new Garage(new Ship(), new Ship(), new Ship()  );

        // gar.gogo();//


    }
}

