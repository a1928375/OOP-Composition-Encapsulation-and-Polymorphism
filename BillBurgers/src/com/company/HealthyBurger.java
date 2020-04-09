package com.company;

public class HealthyBurger extends BaseHamburger{

    private boolean banana = false;
    private boolean apple = false;

    public HealthyBurger(String meat) {
        super("brownRyeBreadRoll", meat);
    }

    public void extraAddition (boolean banana, boolean apple) {

        if (banana == true) {

            this.banana = true;
        }

        if (apple == true) {

            this.apple = true;
        }
    }

    @Override
    public double totalSum() {

        double price = super.totalSum();

        if (banana == true) {

            price += 0.5;
        }

        if (apple == true) {

            price += 3;
        }

        return price+1;  // +1 => different bread
    }

    @Override
    public void receipt() {
        super.receipt();

        if (banana == true) {

            System.out.println("Adding banana with price 0.5$");
        }

        if (apple == true) {

            System.out.println("Adding apple with price 3.0$");
        }
    }

    @Override
    public void moneyDisplay() {

        System.out.println("The base price of your burger is 6.0$ and the total price (include additions) is " + totalSum() + "$" + "\n");

    }
}
