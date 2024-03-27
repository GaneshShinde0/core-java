package com.ganesh.basic.advance.abstraction.challenge;

import java.util.ArrayList;

record OrderItems(int qty, ProductForSale product){}
public class Store {

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();
    public static void main(String[] args) {

        storeProducts.add(new ArtObject("Oil Painting", 1550,"Great work by XYZ painted in 2011"));
        storeProducts.add(new ArtObject("Sculpture",2500,"Bronze work by JFK, Produced in 1948"));
        listProducts();

        System.out.println("\n Order 1");
        var order1 = new ArrayList<OrderItems>();
        addItemToOrder(order1, 1, 2);
        addItemToOrder(order1, 0, 1);
        storeProducts.add(new Furniture("Desk",500,"Mahogany Desk"));
        storeProducts.add(new Furniture("Lamp",100,"Hummingbirds Lamp"));
        printOrder(order1);


        System.out.println("\n Order 2");
        var order2 = new ArrayList<OrderItems>();
        addItemToOrder(order2, 3, 8);
        addItemToOrder(order2, 0, 1);
        addItemToOrder(order2, 2, 1);
        printOrder(order2);
    }

    public static void listProducts(){
        for (var item: storeProducts){
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItems> order, int orderIndex, int quantity){
        order.add(new OrderItems(quantity, storeProducts.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItems> order){
        double salesTotal = 0;
        for(var item : order){
            item.product().printPricedItem(item.qty());
            salesTotal+=item.product().getSalesPrice(item.qty());
        }
        System.out.printf("Sales Total = $%6.2f %n", salesTotal);
    }
}
