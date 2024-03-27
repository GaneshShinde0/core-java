package com.ganesh.basic.advance.interfaces;

// A class can only extend a single class, which is why java is called single inheritance.
// But a class can implement many interfaces. This gives us plug and play functionality, which is what makes them so powerful.
public class Bird extends Animal implements FlightEnabled, Trackable{
    @Override
    public void move() {
        System.out.println("Flapped Wings");
    }

    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + " Took Off!");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " Landed");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " Flying");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s Co-Ordinates Recorded");
    }
}
