package com.ganesh.basic.advance.controlflow;

public class ParsingValues {
	
	public static void main(String[] args) {
		int currentYear = 2022;
		System.out.println(getInputFromScanner(currentYear));
		System.out.println(getInputFromConsole(currentYear));
	}
	public static String getInputFromConsole(int currentYear) {
		String name = System.console().readLine("Hi, What's Your Name?");
		System.out.println("Hi "+name+", Thanks for taking the course!");
		String dateOfBirth = System.console().readLine("What year were you born? ");
		int age = currentYear - Integer.parseInt(dateOfBirth);
		return "So you are "+ age+" years old" ;
	}
	public static String getInputFromScanner(int currentYear) {
		return "";
	}
}
