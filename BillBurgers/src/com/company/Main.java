package com.company;

public class Main {

    public static void main(String[] args) {

        BaseHamburger burger = new BaseHamburger("Classic", "Beef");
        burger.additions(false,true,false,true);
        burger.receipt();
        burger.moneyDisplay();

        HealthyBurger burger1 = new HealthyBurger("Beef");
        burger1.additions(true, false, true, false);
        burger1.extraAddition(false,true);
        burger1.receipt();
        burger1.moneyDisplay();

        DeluxeHamburger burger2 = new DeluxeHamburger("Brown", "Beef");
        burger2.additions(true, true, true, true);
        burger2.receipt();
        burger2.moneyDisplay();

    }
}
