package com.ganesh.designpatterns.templatemethod;

public class Test {
    public static void main(String[] args) {
        ComputerManufacturer cm = new DesktopManufacturer();
        cm.buildComputer();
    }
}
