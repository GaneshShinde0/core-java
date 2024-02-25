package com.ganesh.inheritance;

public class Main {
	
	public static void main(String[] args) {
		
		Animal animal = new Animal("Generic Animal", "huge", 400);
		doAnimalStuff(animal, "slow");
		
		Dog dog = new Dog();
		doAnimalStuff(dog, "fast");
		
		Dog yorkie = new Dog("Yorkie", 15);
		doAnimalStuff(yorkie, "fast");
		
		Dog goldy = new Dog("Goldie", 30,"Floppy","Swimmer");
		doAnimalStuff(goldy, "slow");
		
	}
	public static void doAnimalStuff(Animal animal, String speed) {
		animal.makeNoise();
		animal.move(speed);
		System.out.println(animal);
		System.out.println("________");
	}
}
