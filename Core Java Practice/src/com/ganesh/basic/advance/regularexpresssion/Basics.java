package com.ganesh.basic.advance.regularexpresssion;

import java.util.Arrays;
import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        String helloWorld = "%s %s".formatted("Hello", "World");
        String helloWorldUsingFormat = String.format("Hello", "World");
        System.out.println("Using string's formatted method: "+helloWorld);
        System.out.println("Using String.format: "+helloWorldUsingFormat);
        System.out.println(Basics.formatContains("formatContains: %s, %s", "Formatted", "String"));
        System.out.println(Basics.formatMatches("formatMatches: %s, %s", "Formatted", "String"));


        String testString = "Anyone can Learn abc's, 123's, and any regular expression";
        String replacement = "(-)";

        String[] patterns = {
                "[a-zA-Z]*$",
                "^[a-zA-Z]{3}",
                "[aA]ny\\b" //\\b stands for boundary
        };
        for (String pattern : patterns) {
            String output = testString.replaceFirst(pattern, replacement);
            System.out.println("Pattern: " + pattern + " => " + output);
        }

        String paragraph= """
                The morning mist clung to the treetops, creating an
                ethereal glow as the first rays of sunlight filtered
                through the canopy. Birds chirped joyfully, their songs
                echoing through the tranquil forest. A gentle breeze
                rustled the leaves, carrying with it the earthy scent
                of damp soil and pine.
                                
                In the distance, a stream gurgled softly, its clear
                waters meandering gracefully between moss-covered
                rocks. Nature seemed to awaken with a quiet reverence,
                each creature and plant stirring to life in harmony
                with the rhythm of the forest. It was a scene of
                serenity and beauty, a timeless tableau untouched by
                the passage of time.""";

        String[] lines =paragraph.split("\\R");
        System.out.println("This paragraph has "+lines.length + " lines");

        String[] words =paragraph.split("\\s");
        System.out.println("This paragraph has "+words.length + " words");
        
        System.out.println(paragraph.replaceAll("[a-zA-Z]+st","[ASDF]"));

        Scanner scanner = new Scanner(paragraph);
        System.out.println(scanner.delimiter());

        scanner.useDelimiter("\\R");
        while(scanner.hasNext()){
            String element = scanner.next();
            System.out.println(element);
        }
        scanner=new Scanner(paragraph);
        System.out.println("######################################");
        scanner.tokens()
                .map(s->s.replaceAll("\\p{Punct}",""))
                .flatMap(s-> Arrays.stream(s.split("\\s+")))
                .filter(s->s.matches("[a-zA-Z]+st"))
                .forEach(System.out::println);

        scanner.close();
    }

    private static String formatContains(String regexp, String... args){
        int index =0;
        while(regexp.contains("%s")){
            regexp = regexp.replaceFirst("%s", args[index++]);

        }
        return regexp;
    }

    private static String formatMatches(String regexp, String... args){
        int index =0;
        while(regexp.matches(".*%s.*")){
            regexp = regexp.replaceFirst("%s", args[index++]);

        }
        return regexp;
    }
}
