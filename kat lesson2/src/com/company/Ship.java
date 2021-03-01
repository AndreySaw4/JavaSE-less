package com.company;



    public class Ship extends Vehicle{


        public String getPort() {
            return port;
        }

        public void setPort(String port) {
            this.port = port;
        }

        public int getPassengers() {
            return passengers;
        }

        public void setPassengers(int passengers) {
            this.passengers = passengers;
        }

        private String port;
        private int passengers;


        public Ship(int x, int y, String name, int price, int speed, int year, String port, int passengers) {
            super(x, y, name, price, speed, year);
            this.port = port;
            this.passengers = passengers;
        }






        @Override
        public String toString() {
            return "Ship{" +
                    "coordX=" + coordX +
                    ", coordY=" + coordY +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    ", speed=" + speed +
                    ", year=" + year +
                    ", port=" + port +
                    ", passengers=" + passengers +

                    '}';
        }




    }


