package com.ganesh.basic.advance.lambdaexpression.reverse_names;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    private static Random random = new Random();
    public static void main(String[] args) {

        String[] names = {"Albert","Frodo","Lee","PIP","Lupin","Eve","Genos","Goro"};

        Arrays.setAll(names, i -> names[i].toUpperCase());
        System.out.println("#".repeat(30));
        System.out.println(Arrays.toString(names));

        List<String> backedByArray = Arrays.asList(names);

        backedByArray.replaceAll(s -> s +=" "+getRandomChar('A','Z')+ ".");
        System.out.println("Add Random middle initial");
        System.out.println(Arrays.toString(names));

        backedByArray.replaceAll(s -> s+getReversedName(s.split(" ")[0]));
        System.out.println(" Add Reversed name as last name");
        Arrays.asList(names).forEach(s -> System.out.println(s));

        List<String> newList = new ArrayList<>(List.of(names));
//        newList.removeIf(s-> s.substring(0, s.indexOf(" ")).equals(
//                s.substring(s.lastIndexOf(" ")+1)
//        ));
        newList.removeIf(s-> {
            String first = s.substring(0, s.indexOf(" "));
            String last = s.substring(s.lastIndexOf(" ")+1);
            return first.equals(last);
        });
        System.out.println("Remove names where first = last");
        newList.forEach(s->System.out.println(s));
    }

    public static char getRandomChar(char startChar, char endChar){
        return (char) random.nextInt((int) startChar, (int) endChar+1);
    }

    public static String getReversedName(String firstName){
        return new StringBuilder(firstName).reverse().toString();
    }
}
