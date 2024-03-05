package com.ganesh.basic.advance.polymorphism.encapsulation;

/*
Encapsulation is defined as the wrapping up of data under
a single unit. It is the mechanism that binds together code
and the data it manipulates. Another way to think about
encapsulation is, it is a protective shield that prevents
the data from being accessed by the code outside this shield.
*/
public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }
        return -1;
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (this.duplex) {
            System.out.println("Printing in duplex mode");
            pagesToPrint = (pages / 2) + (pages % 2);
            this.pagesPrinted += pagesToPrint;
        } else {
            this.pagesPrinted += pagesToPrint;
        }
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return this.pagesPrinted;
    }
}

