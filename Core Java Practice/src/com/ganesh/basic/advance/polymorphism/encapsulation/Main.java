package com.ganesh.basic.advance.polymorphism.encapsulation;

public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        player.name = "tony";
        player.health = 20;
        player.weapon = "Light Saber";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining Health = "+ player.healthRemaining());

        player.loseHealth(11);
        System.out.println("Remaining Health = "+player.healthRemaining());
    }
}
