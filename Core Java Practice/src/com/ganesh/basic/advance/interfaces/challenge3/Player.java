package com.ganesh.basic.advance.interfaces.challenge3;

import java.util.List;
import java.util.ArrayList;

public class Player implements ISaveable{
    // write code here
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength){
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon="Sword";
    }

    // Getter and setter for 'name'
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for 'weapon'
    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    // Getter and setter for 'hitPoints'
    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    // Getter and setter for 'strength'
    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public List<String> write(){
        List<String> list=new ArrayList<String>();
        list.add(this.name);
        list.add(""+this.hitPoints);
        list.add(""+strength);
        list.add(this.weapon);
        return list;
    }

    public void read(List<String> text){
        if(text == null) return;
        if(text.size()<=0) return;
        name = text.get(0);
        hitPoints = Integer.parseInt(text.get(1));
        strength = Integer.parseInt(text.get(2));
        weapon = text.get(3);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +

                '}';
    }

}