package com.ganesh.designpatterns.factory;

public class Male implements Person{

    @Override
    public void wish(String message) {
        System.out.println("Make With in Male class "+ message);
    }
}
