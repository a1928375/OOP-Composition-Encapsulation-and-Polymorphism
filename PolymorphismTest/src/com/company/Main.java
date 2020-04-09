package com.company;

class Car {

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car (String name, int cylinders) {

        this.engine = true;
        this.wheels = 4;

        this.name = name;
        this.cylinders = cylinders;
    }

    public String getName () {

        return this.name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String startEngine () {

        return "Engine is starting";
    }

    public String accelerate () {

        return "Accelerating to 100 km/s within 10 s";
    }

    public String brake () {

       return "The car is stopping";
    }
}

class Ferrari extends Car {

    public Ferrari () {

        super("F8 Tributo", 12);
    }

    @Override
    public String accelerate() {
        return "Accelerating to 100 km/s within 2.9 s";
    }
}

class Porsche extends Car {

    public Porsche () {

        super("Panamera", 8);
    }

    @Override
    public String accelerate() {
        return  "Accelerating to 100 km/s within 5 s";
    }
}

class AstonMartin extends Car {

    public AstonMartin () {

        super("Vantage", 10);
    }

    @Override
    public String accelerate() {
        return "Accelerating to 100 km/s within 7 s";
    }
}


public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++) {

            Car car = randomCar();

            System.out.println("# " + i + " : The car is " + car.getName() + "\n"
                                + "The speed is " + car.accelerate() + "\n");
        }

    }

    private static Car randomCar () {

        int randomNumber = (int) (Math.random() * 3) +1;

        System.out.println("The random number is " + randomNumber);

        switch (randomNumber) {

            case 1:

                return new Ferrari();

            case 2:

                return new Porsche();

            case 3:

                return new AstonMartin();

            default:

                return null;
        }

    }


}
