package com.ganesh.basic.advance.interfaces;

public class Test {

    public static void main(String[] args){
        inFlight(new Jet());
//        OrbitEarth.log("Testing "+ new Satellite());
        inOrbit(new Satellite());
    }

    private static void inFlight(FlightEnabled flier){
        flier.takeOff();
        flier.transition(FlightStages.LAUNCH);
        flier.fly();
        if(flier instanceof Trackable tracked){
            tracked.track();
        }
        flier.land();
    }

    private static void inOrbit(OrbitEarth flier){
        flier.takeOff();
        flier.fly();
        flier.land();
    }
}
