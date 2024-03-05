package com.ganesh.basic.advance.polymorphism.computerfactory;

public class PersonalComputer extends Product{

    private ComputerCase computerCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PersonalComputer(String model, String manufacturer, ComputerCase computerCase, Monitor monitor, MotherBoard motherBoard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    private void drawLogo(){
        monitor.drawPixelAt(1200,600,"yellow");
    }

    public void powerUp(){
        computerCase.pressPowerButton();
        drawLogo();
    }
    public ComputerCase getComputerCase() {
        return computerCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }
}
