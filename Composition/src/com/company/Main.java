package com.company;

public class Main {

    public static void main(String[] args) {

        Wall wall1 = new Wall ("North");
        Wall wall2 = new Wall ("South");
        Wall wall3 = new Wall ("West");
        Wall wall4 = new Wall ("East");

        Ceiling ceiling = new Ceiling(12, 56);

        Bed bed = new Bed("Modern", 2 , 5, 1, 1);

        Lamp lamp = new Lamp("Classic", false, 99);

        Bedroom bedroom = new Bedroom("Mine", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        bedroom.makeBed();
        bedroom.getLamp().turnOn();

    }
}
