package com.company;

public class Garage {


    private Vehicle[] garrArray;

    public Garage(Vehicle ... garageArray) {
        garrArray = new Vehicle[garageArray.length];

        for (int i = 0; i < garageArray.length; i++) {
                     this.garrArray[i] = garageArray[i];
       }
    }

    public void gogo(){
        System.out.println("gogogo");
    }


   public void goGo() {
     for (int i = 0; i < garrArray.length; i++) {
         System.out.println(garrArray[i].toString());
    }
   }

   public String getByType(String type)
   {
       String res = "";
       for (int i = 0; i < garrArray.length; i++) {
           if (garrArray[i].getClass().getSimpleName().equals(type))
               res += garrArray[i] + "\n";
       }

       return res;
   }




//private SweetProducer [] factory;
    //   public SweetCreator(SweetProducer ... sweetProducers) {
    //      factory = new SweetProducer[sweetProducers.length];
    //      for (int i = 0; i < factory.length; i++) {
    //           this.factory[i] = sweetProducers[i];
//       }
    //   }

    // public adddCar( )


    void addCar(String s) {
    }

    void addShip(String s) {
    }

    void addPlane(String s) {
    }

}
