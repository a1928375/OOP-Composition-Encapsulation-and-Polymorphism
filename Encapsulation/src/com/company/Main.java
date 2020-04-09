package com.company;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(58, 0, true);

        System.out.println("The toner level is " + printer.getTonerLevel() + "%");
        System.out.println("The numbers of pages are " + printer.getNumbersOfPages() + " pages");
        System.out.println("Is it duplex printer: " + printer.isDuplexPrinter());

        printer.fillUp(38);
        printer.pagesPrinted(16);
        printer.pagesPrinted(5);

        printer.fillUp(88);
        printer.fillUp(-188);

        Printer printer2 = new Printer(58, 0, false);
        printer2.pagesPrinted(16);
        printer2.pagesPrinted(5);
    }
}
