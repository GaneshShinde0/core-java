package com.ganesh.basic.advance.lambdaexpression.methodreference2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.UnaryOperator;

public class Main {

    private static Random random = new Random();

    private record Person(String first){
        public String last(String s){
            return first + " "+s.substring(0,s.indexOf(" "));
        }
    }

    private static void applyChanges(String[] names, List<UnaryOperator<String>> stringFunctions){
        List<String> backedByArray = Arrays.asList(names);
        for(var function:stringFunctions){
            backedByArray.replaceAll(s->s.transform(function));
            System.out.println(Arrays.toString(names));
        }
    }

    private static char getRandomChar(char startChar, char endChar){
        return (char) random.nextInt((int) startChar, (int) endChar + 1);
    }

    private static String reverse(String s, int start, int end){
        return new StringBuilder(s.substring(start, end)).reverse().toString();
    }

    private static String reverse(String s){
        return reverse(s,0,s.length());
    }

    public static void main(String[] args) {

        String[] names = {"Albert","Frodo","Lee","Nick","Lupin","Goemon","Genos","Goro"};

        Person jake = new Person("Jake");
        List<UnaryOperator<String>> list = new ArrayList<>(List.of(
                String::toUpperCase,
                s->s+=" "+getRandomChar('A','Z')+".",
                s->s+=" "+reverse(s,0,s.indexOf(" ")),
                Main::reverse,
                String::new,
//                s->new String("RandomString"+s),
                s-> "RandomString" + s,
                String::valueOf,
                jake::last,
                new Person("MARY")::last
        ));

        applyChanges(names, list);
    }
}
