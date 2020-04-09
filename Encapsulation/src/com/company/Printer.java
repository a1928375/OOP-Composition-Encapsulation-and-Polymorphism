package com.company;

public class Printer {

    private int tonerLevel;
    private int numbersOfPages;
    private boolean duplexPrinter;

    public Printer (int tonerLevel, int numbersOfPages, boolean duplexPrinter) {

        if (tonerLevel < 0) {

            this.tonerLevel = 0;
        } else if (tonerLevel > 100) {

            this.tonerLevel = 100;

        } else {

            this.tonerLevel = tonerLevel;
        }

        if (numbersOfPages < 0) {

            this.numbersOfPages =0;
        } else {

            this.numbersOfPages = numbersOfPages;
        }

        this.duplexPrinter = duplexPrinter;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumbersOfPages() {
        return numbersOfPages;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }

    public void fillUp (int amount) {

        if (tonerLevel + amount >= 100) {

//            tonerLevel = 100;
            System.out.println("The adding amount exceeds the toner");

        } else if (tonerLevel + amount <= 0) {

//            tonerLevel = 0;
            System.out.println("The adding amount is invalid");

        } else {

            tonerLevel += amount;
            System.out.println("The toner is " + tonerLevel + "%");
        }
    }

    public void pagesPrinted (int pages) {

        if (pages <= 0) {

            System.out.println("The printed pages are " + numbersOfPages);
        } else {

            if (duplexPrinter) {

                numbersOfPages += (pages/2 + pages%2);

                System.out.println("The printed pages are " + (numbersOfPages) + " pages with duplex page mode");
            } else {

                numbersOfPages += (pages);
                System.out.println("The printed pages are " + (numbersOfPages) + " pages with single page mode");
            }
        }
    }
}


