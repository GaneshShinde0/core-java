package com.ganesh.designpatterns.templatemethod;

public abstract class ComputerManufacturer {
    public void buildComputer(){
        addHardDisk();
        addRam();
        addKeyboard();
    }

    abstract void addHardDisk();
    abstract void addKeyboard();
    abstract void addRam();
}
