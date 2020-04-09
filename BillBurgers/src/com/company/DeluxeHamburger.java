package com.company;

public class DeluxeHamburger extends BaseHamburger{

    public DeluxeHamburger(String breadRollType, String meat) {
        super(breadRollType, meat);
    }

    @Override
    public void additions(boolean lettuce, boolean tomato, boolean carrot, boolean onion) {
        super.additions(false, false, false, false);           //直接把 4 arguments default為false
    }

    @Override
    public double totalSum() {
        return super.totalSum() + 5;  //+5 => combo
    }

    @Override
    public void receipt() {
        super.receipt();
        System.out.println("This combo includes free chips & drinks" + "\n" + "You cannot choose any addition for this burger");
    }


    public void moneyDisplay() {

        System.out.println("The base price of your burger is 10.0$ and the total price is " + totalSum() + "$" + "\n");
    }
}
