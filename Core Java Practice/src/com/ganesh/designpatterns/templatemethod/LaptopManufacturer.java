package com.ganesh.designpatterns.templatemethod;

public class LaptopManufacturer extends ComputerManufacturer{
    @Override
    void addHardDisk() {
        System.out.println("Laptop - HardDisk added!");
    }

    @Override
    void addKeyboard() {
        System.out.println("Laptop - Keyboard added!");
    }

    @Override
    void addRam() {
        System.out.println("Laptop - RAM added!");
    }
}
