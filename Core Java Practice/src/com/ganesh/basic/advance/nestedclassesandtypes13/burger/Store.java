package com.ganesh.basic.advance.nestedclassesandtypes13.burger;

public class Store {
    public static void main(String[] args) {

        Meal regularMeal = new Meal();
        System.out.println(regularMeal);

        Meal AUregularMeal = new Meal(1.2d);
        System.out.println(regularMeal);
    }
}
