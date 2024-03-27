package com.ganesh.basic.advance.generics.challenge1;

public class Park extends Point{

    private String name;

    public Park(String name, String location){
        super(location);
        this.name = name;
    }

    @Override
    public String toString(){
        return name + " National Park";
    }
}
