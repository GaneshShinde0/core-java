package com.ganesh.basic.advance.abstraction;

public class Dog extends Mammal{

    // We need to create constructor whenever we extend abstract class
    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    // We need to override all methods form abstract method.
    @Override
    public void move(String speed) {
        if (speed.equals("slow")) {
            System.out.print(getExplicitType() + "Walking! ");
        } else{
            System.out.println(getExplicitType() + " running");
        }
    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType()+" shed hair all the time");
    }

    // We need to override all methods form abstract method.
    @Override
    public void makeNoise() {

        // We can access type which is protected here.
        if (type == "Wolf"){
            System.out.print("Howling! ");
        } else {
            System.out.println("Woof! ");
        }
    }
}
