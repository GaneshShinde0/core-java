package com.ganesh.basic.advance.nestedclassesandtypes13.burger;

public class Meal {

    private double base =5.0;
    private Item burger;
    private Item drink;
    private Item side;

    private double total;

    private double conversionRate;

    public Meal(){
        this.conversionRate =1;
        burger = new Item("regular","burger");
        drink = new Item("coke","drink",1.5);
        System.out.println(drink.name);
        side = new Item("fries","side",2.0);
    }

    public Meal(double conversioRate){
        this.conversionRate=this.conversionRate;
        burger = new Item("regular","burger");
        drink = new Item("coke","drink",1.5);
        System.out.println(drink.name);
        side = new Item("fries","side",2.0);
    }

    public double getTotal(){
        double total = burger.price+drink.price+side.price;
        return Item.getPrice(total,conversionRate);
    }
    @Override
    public String toString(){
        return "%s%n%s%n%s%n%26s$%.2f".formatted(burger, drink, side,"Total Due: ",getTotal());
    }

    private class Item {

        private String name;
        private String type;
        private double price;
        public Item(String name, String type){
            this(name,type,type.equals("burger")?base:0);
        }

        public Item(String name, String type, double price) {
            this.name = name;
            this.type = type;
            this.price = price;
        }

        @Override
        public String toString(){
            return "%10s%15s $%.2f".formatted(type,name,price);
        }
        private static double getPrice(double price, double rate){
            return price*rate;
        }
    }


}
