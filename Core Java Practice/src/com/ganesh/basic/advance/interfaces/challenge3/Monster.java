package com.ganesh.basic.advance.interfaces.challenge3;

import java.util.List;
import java.util.ArrayList;

public class Monster implements ISaveable{
    // write code here
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength){
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    // Getter and setter for 'name'
    public String getName() {
        return name;
    }

    // Getter and setter for 'hitPoints'
    public int getHitPoints() {
        return hitPoints;
    }

    // Getter and setter for 'strength'
    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    public List<String> write(){
        List<String> list=new ArrayList<String>();
        list.add(name);
        list.add(""+hitPoints);
        list.add(""+strength);
        return list;
    }

    public void read(List<String> text){
        if(text == null) return;
        if(text.size()<=0) return;
        name = text.get(0);
        hitPoints = Integer.parseInt(text.get(1));
        strength = Integer.parseInt(text.get(2));
    }
}