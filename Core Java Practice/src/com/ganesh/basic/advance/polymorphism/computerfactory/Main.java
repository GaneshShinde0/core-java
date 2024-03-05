package com.ganesh.basic.advance.polymorphism.computerfactory;

public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("1234","Lenevo","230");
        Monitor theMonitor = new Monitor("55inch Bravia", "Sony",55,"2540*1440");
        MotherBoard theMotherBoard = new MotherBoard("BJ-200","ASUS",4,6,"v2.44");

        PersonalComputer thePC = new PersonalComputer("1234","Lenevo", theCase, theMonitor, theMotherBoard);

        thePC.powerUp();
        thePC.getMonitor().drawPixelAt(10,10,"red");
        thePC.getMotherBoard().loadProgram("Window OS");
        thePC.getComputerCase().pressPowerButton();
    }
}
