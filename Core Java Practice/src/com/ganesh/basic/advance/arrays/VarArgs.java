package com.ganesh.basic.advance.arrays;

public class VarArgs {

    public static void main(String... args) {
        System.out.println("Running "+new Object(){}.getClass().getEnclosingClass().getName());
        String[] splitStrings = "Hello World Again".split(" ");
        printText(splitStrings);

        System.out.println("_".repeat(20));
        printText("Hello");

        System.out.println("_".repeat(20));
        printText("Hello", "World","Again");

        System.out.println("_".repeat(20));
        printText();

        String[] sArray = {"first","second","third","fourth","fifth"};
        System.out.println(String.join(",",sArray));
    }

    private static void printText(String... textList){
        for(String t: textList){
            System.out.println(t);
        }
    }
}
