package com.ganesh.basic.advance.lambdaexpression.challenge;

import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {
        String source = "AFDF ASD ASD JDMO WENVE";
        System.out.println(everySecondChar(source));

        Function<String,String> everySecondCharacter= s->{
            String output="";
            for(int i=1; i<s.length();i+=2){
                output+=s.charAt(i);
            }
            return output;
        };

        System.out.println(everySecondCharacter.apply(source));
        System.out.println(everySecondCharacterFunctionArgument(source,everySecondCharacter));
        Consumer<String> x = s->{
            String output="";
            for(int i=1; i<s.length();i+=2){
                output+=s.charAt(i);
            }
            System.out.println(output);
        };
        x.accept(source);
    }
    public static String everySecondChar(String source){
        StringBuilder returnVal = new StringBuilder();
        for(int i=0; i<source.length();i++){
            if(i%2==1){
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();
    }

    public static String everySecondCharacterFunctionArgument(String source, Function<String, String> func){
        return func.apply(source);
    }
}
