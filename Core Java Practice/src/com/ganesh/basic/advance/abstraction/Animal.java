package com.ganesh.basic.advance.abstraction;

/*
Why use a abstract class?
- You may never need to use an abstract class in your design, but there are some good arguments for using them.
- An abstract class in your hierarchy forces the designers of subclasses, to think about, and create unique and targeted implementations, for the abstracted methods.
- It may not always make sense to provide a default, or inherited implementation, of a particular method.
- An abstract class can't be instantiated, so if you're using abstract classes to design a framework for implementation, this is definitely an advatage.
 */
abstract class Mammal extends Animal{

    // We will be forced to create constructor.
    // We will not be forced to implement abstract methods.
    // Abstract class that extends another abstract class has flexibility.
    // It can implement some abstract methods.
    // Or none of the abstract methods.
    // It can include additional abstract methods, which will for subclass to implement both Animal's abstract methods, and Mammal's.
    public Mammal(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed){
        System.out.println(getExplicitType() + " ");
        System.out.println(speed.equals("slow")?"walks":"runs");
    }

    public abstract void shedHair();
}

public abstract class Animal {

    protected String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight){
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    // Abstract Method's cannot have bodies.
    // private abstract (invalid) we cannot declare abstract as private.
    public abstract void move(String speed);
    public abstract void makeNoise();

    // If we try to override final method we will get error (Overridden method is final)
    public final String getExplicitType(){
        return getClass().getSimpleName() + " ("+type+") ";
    }
}
