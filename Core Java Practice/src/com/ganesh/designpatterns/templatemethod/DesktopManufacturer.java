package com.ganesh.designpatterns.templatemethod;

public class DesktopManufacturer extends ComputerManufacturer {
    @Override
    void addHardDisk() {
        System.out.println("Desktop - HardDisk Added!!!");
    }

    @Override
    void addKeyboard() {
        System.out.println("Desktop - Keyboard Added!!!");
    }

    @Override
    void addRam() {
        System.out.println("Desktop - RAM Added!!!");
    }

}
