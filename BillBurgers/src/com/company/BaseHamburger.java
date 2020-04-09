package com.company;

public class BaseHamburger {

    private String breadRollType;
    private String meat;
    private double basePrice;

    private boolean lettuce= false;
    private boolean tomato= false;
    private boolean carrot= false;
    private boolean onion= false;


    public BaseHamburger(String breadRollType, String meat) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basePrice = 5;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    //    public boolean isLettuce (boolean lettuce) {
//
//        if (lettuce == true) {
//
//
//        }
//
//
//    }

    public void additions (boolean lettuce, boolean tomato, boolean carrot, boolean onion) {

        if (lettuce == true) {

            this.lettuce = true;
        }

        if (tomato == true) {

            this.tomato = true;
        }

        if (carrot == true) {

            this.carrot = true;
        }

        if (onion == true) {

            this.onion = true;
        }

    }

    public double totalSum () {

        double price = this.basePrice;

        if (lettuce == true) {

            price += 1;
        }

        if (tomato == true) {

            price += 1.5;
        }

        if (carrot == true) {

            price += 2;
        }

        if (onion == true) {

            price += 2.5;
        }

        return price;
    }

    public void receipt () {

        System.out.println("Your burger is " + getClass().getSimpleName() + ": Your bread is " + getBreadRollType() + " and your meat is " + getMeat());

        if (lettuce == true) {

            System.out.println("Adding lettuce with price 1.0$");
        }

        if (tomato == true) {

            System.out.println("Adding tomato with price 1.5$");
        }

        if (carrot == true) {

            System.out.println("Adding carrot with price 2.0$");
        }

        if (onion == true) {

            System.out.println("Adding onion with price 2.5$");
        }

    }

    public void moneyDisplay () {

        System.out.println("The base price of your burger is 5.0$ and the total price (include additions) is " + totalSum() + "$" + "\n");
    }

}


