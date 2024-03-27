package com.ganesh.basic.advance.abstraction.challenge;

public abstract class ProductForSale {
    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public final double getSalesPrice(int quantity){
        return quantity*this.price;
    }

    public void  primaryItem(int quantity) {
        System.out.println("%2d quantity at $%8.2f each,  %-15s %35s %m");
    }

    public abstract void showDetails();

    public void printPricedItem(int qty) {
        System.out.printf("%2d qty at $%8.2f each, %-15s %-35s %n", qty, price, type, description);
    }
}
