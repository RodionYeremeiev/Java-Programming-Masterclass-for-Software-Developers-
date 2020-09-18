package com.gmail.ryitlearning;

public class Printer {
    // Create a class and demonstate proper encapsulation techniques
    // the class will be called Printer
    // It will simulate a real Computer Printer
    // It should have fields for the toner Level, number of pages printed, and
    // also whether its a duplex printer (capable of printing on both sides of the paper).
    // Add methods to fill up the toner (up to a maximum of 100%), another method to
    // simulate printing a page (which should increase the number of pages printed).
    // Decide on the scope, whether to use constructors, and anything else you think is needed.
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel >-1 && tonerLevel <=100) {
            this.tonerLevel = tonerLevel;
        } else {
            tonerLevel = -1;
        }
        this.isDuplex = isDuplex;
        this.pagesPrinted = 0;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public int addToner(int tonerAmmount){
        if (tonerLevel>0 && tonerAmmount<=100){
            if (this.tonerLevel + tonerAmmount > 100){
                return -1;
            }
            this.tonerLevel += tonerAmmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int ammount){

        int pagesToPrint = ammount;
        if (this.isDuplex){
            pagesToPrint = (ammount/2) + (ammount%2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted+= pagesToPrint;
        return pagesToPrint;
    }
}
