package com.ganesh.basic.advance.lambdaexpression.challenge;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;

public class Sample1 {
    public static void main(String[] args) {
        String sentence= "SASDF ASA ASFDA00";

        Consumer<String> printThePartsWithIntelliJ = sentence1 -> {
            String[] parts = sentence1.split(" ");
            for(String part:parts){
                System.out.println(part);
            }
        };


        printThePartsWithIntelliJ.accept(sentence);
        Consumer<String> printThePartsLambda = s->{
            String[] split = s.split(" ");
            Arrays.asList(split).forEach(System.out::println);
        };

        printThePartsLambda.accept(sentence);
        Consumer<String> printTheParts = new Consumer<String>(){
            @Override
            public void accept(String sentence){
                String[] parts = sentence.split(" ");
                for(String part:parts){
                    System.out.println(part);
                }
            }
        };
        printTheParts.accept(sentence);
    }
}
