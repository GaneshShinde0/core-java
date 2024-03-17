package com.ganesh.basic.advance.polymorphism.restaurant;

public class Main {
    public static void main(String[] args) {
//        Item coke = new Item("drink","coke", 1.50);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item avocado = new Item("Topping", "Avocado", 1.5);
//        avocado.printItem();


//
//        Burger burger = new Burger("regular", 4.0);
//        burger.addToppings("BACON","CHEESE","MAYO");
//        burger.printItem();

//        MealOrder mealOrder = new MealOrder();
//        mealOrder.printItemizedList();
//        mealOrder.setDrinkSize("LARGE");
//        mealOrder.printItemizedList();

//        MealOrder secondMeal= new MealOrder("turkey","Coke", "Chilli");
//        secondMeal.addBurgerToppings("LETTUCE","CHEESE","MAYO");
//        secondMeal.setDrinkSize("SMALL");
//        secondMeal.printItemizedList();

        MealOrder deluxeMeal = new MealOrder("deluxe","7-up","chilli");
        deluxeMeal.addBurgerToppings("AVOCADO","BACON","LETTUCE","CHEESE","MAYO");
        deluxeMeal.setDrinkSize("SMALL");
        deluxeMeal.printItemizedList();
    }
}
