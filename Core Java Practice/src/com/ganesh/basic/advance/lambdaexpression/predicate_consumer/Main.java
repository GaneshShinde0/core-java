package com.ganesh.basic.advance.lambdaexpression.predicate_consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("alpha","bravo","charlie","delta"));

        for(String s: list){
            System.out.println(s);
        }
        System.out.println("#".repeat(50));
        list.stream().forEach(System.out::println);

        System.out.println("#".repeat(50));
        list.forEach(s -> System.out.println(s));

        System.out.println("#".repeat(10)+"Using Functional Interface"+"#".repeat(10));
        list.forEach(System.out::println);

        System.out.println("#".repeat(50));
        // list.forEach(String s -> System.out.println(s)); Won't work
        list.forEach((String s) -> System.out.println(s));

        System.out.println("#".repeat(50));
        list.forEach((var s) -> System.out.println(s));

        System.out.println("#".repeat(50));
        list.forEach(System.out::println);

        System.out.println("#".repeat(50));
        list.forEach((var s)->{
           System.out.println(s.substring(0,1).toUpperCase()+" stands for "+s);
        });

        // String s = ""; // This will give error at line 40 because it creates conflict.
        System.out.println("#".repeat(50));
        String prefix = "#. ";
        list.forEach((var s)->{
            System.out.println(prefix+s.substring(0,1).toUpperCase()+" stands for "+s);
        });
        int result1 = calculator((var a,var b)->a+b,5,2); //(var a,Integer b) will give error
        //int result1 = calculator((var a,var b)->{return a+b;},5,2); // return can be used if we use curly brace and end with semicolon
        var result2 = calculator((a,b)-> a/b, 10.0, 2.25);
        var result3 = calculator((a,b)-> a.toUpperCase()+" "+b.toUpperCase(), "Jake", "Sully");
        var result4 = calculator((a,b)->{String result0 = a.toUpperCase()+" "+b.toUpperCase(); return result0;}, "Jesse", "Pinkman");

        var coords = Arrays.asList(new double[]{40.7128, -74.0060}, // New York City, USA
                new double[]{51.5074, -0.1278},   // London, UK
                new double[]{48.8566, 2.3522},    // Paris, France
                new double[]{-33.8688, 151.2093}  // Sydney, Australia
                );

        coords.forEach(s->System.out.println(Arrays.toString(s)));

        BiConsumer<Double, Double> p1 = (lat,lng)-> System.out.printf("[lat:%.3f lon:%.3f]%n", lat, lng);

        var firstPoint = coords.get(0);
        processPoint(firstPoint[0],firstPoint[1],p1);
        System.out.println("#".repeat(50));
        coords.forEach(s->processPoint(s[0],s[1],p1));
        System.out.println("#".repeat(50));
        coords.forEach(s->processPoint(s[0],s[1],(lat,lng)-> System.out.printf("[lat:%.3f lon:%.3f]%n", lat, lng)));

        list.removeIf(s->s.equalsIgnoreCase("bravo"));
        list.forEach(s->System.out.println(s));

        list.addAll(List.of("echo","easy", "earnest"));

        System.out.println("#".repeat(50));
        list.forEach(s->System.out.println(s));

        System.out.println("#".repeat(50));
        list.removeIf(s->s.startsWith("e"));
        list.forEach(s->System.out.println(s));

        System.out.println("#".repeat(50));
        list.replaceAll(s->s.charAt(0)+" - "+s.toUpperCase());
        list.forEach(System.out::println);

        String[] emptyStrings = new String[10];
        System.out.println(Arrays.toString(emptyStrings));
        Arrays.fill(emptyStrings,"");
        System.out.println(Arrays.toString(emptyStrings));
        Arrays.setAll(emptyStrings, (i)-> (i+1)+". "+
                switch(i){
            case 0 ->"one";
            case 1 -> "two";
            default ->"";
                });
        System.out.println(Arrays.toString(emptyStrings));

        // Supplier Lambda Expression
        String[] names = {"Albert","Frodo","Lee","Nick","Lupin","Goemon","Genos","Goro"};
        String[] randomList = randomlySelectedValues(15,names, ()->new Random().nextInt(0, names.length));
        System.out.println(Arrays.toString(randomList));

    }

//    public static <T> T calculator(Operation<T> function, T value1, T value2){
//        T result = function.operate(value1,value2);
//        System.out.println("Result of operation: "+result);
//        return result;
//    }

    public static <T> T calculator(BinaryOperator<T> function, T value1, T value2){
        T result = function.apply(value1,value2);
        System.out.println("Result of operation: "+result);
        return result;
    }

    public static <T> void processPoint(T t1, T t2, BiConsumer<T,T> consumer){
        consumer.accept(t1,t2);
    }

    // Supplier Lambda Expression
    public static String[] randomlySelectedValues(int count, String[] values, Supplier<Integer> s){
        String[] selectedValues = new String[count];
        for(int i=0; i<count; i++){
            selectedValues[i] = values[s.get()];
        }
        return selectedValues;
    }
}
