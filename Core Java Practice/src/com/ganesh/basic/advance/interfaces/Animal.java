package com.ganesh.basic.advance.interfaces;

enum FlightStages implements Trackable {
    GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void track() {
        if (this != GROUNDED) {
            System.out.println("Monitoring " + this);
        }
    }

    public FlightStages getNextStage(){
        FlightStages[] allStages = values();
        return allStages[(ordinal()+1)%allStages.length];
    }
}

interface OrbitEarth extends FlightEnabled {
    void achieveOrbit();

    private static void log(String description){
        var today = new java.util.Date();
        System.out.println(today + ": "+ description);
    }

    private void logStage(FlightStages stage, String description){
        description = stage + ": "+description;
        log(description);
    }

    @Override
    default FlightStages transition(FlightStages stage) {
        FlightStages nextStage = FlightEnabled.super.transition(stage);
        logStage(stage, "Begining Trasition to "+ nextStage);
        return nextStage;
    }
}

// We don't have to declare the interface type abstract, because this modifier is implicitly declared, for all interfaces.
// abstract interface FlightEnabled{} // abstract modifier here is unnecessary and simply redundant.
// Like wise we don't have to declare any method abstract. In fact, any method declared without a body is really implicitly declared both public and abstract.
interface FlightEnabled {

    // Following are implicitly final;
    double MILE_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;

    //    public abstract void takeOff(); // Public and abstract modifiers are redundant; As void fly would implicitly declare both abstract and public.
    void takeOff();

    //    abstract void land();
    void land();

    void fly(); // Preferred Declaration.

    // All members of an interface are implicitly public.
    // If we omit an access modifier on a class member, its implicitly package private.
    // If we omit an access modifier on a interface member, it is implicitly public.
    // This is an important difference and one you need to remember.

    default FlightStages transition(FlightStages stage) {
//        System.out.println("Transition is not implemented on " + this.getClass().getName());
//        return null;
        FlightStages nextStage = stage.getNextStage();
        System.out.println("Transitioning From "+ stage + " to "+ nextStage);
        return nextStage;
    }
}

// Interface is assumed to be public and abstract.
interface Trackable {

    // Interface abstract methods cannot have a body.
    void track();
}

record DragonFly(String name, String type) implements FlightEnabled {

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

class Satellite implements OrbitEarth {

    FlightStages stage = FlightStages.GROUNDED;

    // I have to give public here as this method is public in interface.
    public void achieveOrbit() {
        transition("Orbit achieved!");
    }

    @Override
    public void takeOff() {
        transition("Taking Off");
    }

    @Override
    public void land() {
        transition("Landing ");
    }

    @Override
    public void fly() {
        achieveOrbit();
        transition("Data Collection While Orbiting");
    }

    public void transition(String description){
        System.out.println(description);
        stage = transition(stage);
        stage.track();
    }
}

public abstract class Animal {

    public abstract void move();
}
