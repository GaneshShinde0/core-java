package com.ganesh.designpatterns.factory;

public class Female implements Person{

    @Override
    public void wish(String message) {
        System.out.println("Make With in Female class "+ message);
    }

}
