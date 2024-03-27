package com.ganesh.basic.advance.interfaces;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        An interface allows us to treat an instance of a single class as many types.
//        The Bird class inherits behavior and attributes form Animal, because we used te extend keyword in the declaration of Bird.
//        Because the move method was abstract on Animal, Bird was required to implement it.
//        The Bird Class implements the FlightEnabled Interface.
//        Ths required the Bird class to implement the takeOff, fly, and land methods, the abstract methods on Flight Enabled.

//        Interfaces let us take objects, that may have almost nothing in common, and write reusable code, so we can process them all in a like manner.
        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked= bird;

        animal.move();
//        Wont work
//        flier.move();
//        tracked.move();

        flier.takeOff();
        flier.fly();
        tracked.track();
        flier.land();

        inFlight(flier);

        inFlight(new Jet());

        Trackable truck = new Truck();
        truck.track();

        double kmsTraveled = 100;
        double milesTraveled = kmsTraveled*FlightEnabled.KM_TO_MILES;

        System.out.printf("The truck traveled %.2f km or %.2f miles %n",kmsTraveled, milesTraveled);


        ArrayList<FlightEnabled> fliers = new ArrayList<>();
        fliers.add(bird);

        LinkedList<FlightEnabled> fliersLL = new LinkedList<>();
        fliersLL.add(bird);

        // Is better than previous declaration.
        // We can use LinkedList, ArrayList parameters when we declare methods with List
        List<FlightEnabled> betterFliers = new ArrayList<>();
        betterFliers.add(bird);

        triggerFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);

        triggerFliers(fliersLL);
        flyFliers(fliersLL);
        landFliers(fliersLL);

        // Following wont compile when method has ArrayList as parameter
        triggerFliers(betterFliers);
        flyFliers(betterFliers);
        landFliers(betterFliers);
    }

    public static void inFlight(FlightEnabled flier){
        flier.takeOff();
        flier.fly();
        if(flier instanceof Trackable tracked){
            tracked.track();
        }
        flier.land();
    }

    private static void triggerFliers(List<FlightEnabled> fliers){
        for (var flier: fliers){
            flier.takeOff();
        }
    }

    private static void flyFliers(List<FlightEnabled> fliers){
        for (var flier: fliers){
            flier.fly();
        }
    }

    private static void landFliers(List<FlightEnabled> fliers){
        for (var flier: fliers){
            flier.land();
        }
    }
}
