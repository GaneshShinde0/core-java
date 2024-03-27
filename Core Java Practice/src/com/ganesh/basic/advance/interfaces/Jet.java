package com.ganesh.basic.advance.interfaces;

public class Jet implements FlightEnabled, Trackable{
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
        System.out.println(getClass().getSimpleName() + "Flying");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s Co-Ordinates Recorded");
    }

    @Override
    public FlightStages transition(FlightStages stage){
//        return FlightEnabled.super.transition(stage);
        System.out.println(getClass().getSimpleName()+"transitioning");
        return FlightEnabled.super.transition(stage);//return FlightStages.CRUISE;
    }
}
