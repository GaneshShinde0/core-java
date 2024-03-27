package com.ganesh.basic.advance.interfaces;

public class Truck implements Trackable{
    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s Co-Ordinates Recorded");
    }
}
