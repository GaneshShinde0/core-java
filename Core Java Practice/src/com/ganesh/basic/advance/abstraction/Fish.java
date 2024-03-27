package com.ganesh.basic.advance.abstraction;

public class Fish extends Animal{

    // We need to create constructor whenever we extend abstract class
    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    // We need to override all methods form abstract method.
    @Override
    public void move(String speed) {
        if (speed.equals("slow")) {
            System.out.print(getExplicitType() + "lazily swimming! ");
        } else{
            System.out.println(getExplicitType() + " darting");
        }
    }

    // We need to override all methods form abstract method.
    @Override
    public void makeNoise() {

        // We can access type which is protected here.
        if (type == "Goldfish"){
            System.out.print("swish! ");
        } else {
            System.out.println("Splash! ");
        }
    }
}
