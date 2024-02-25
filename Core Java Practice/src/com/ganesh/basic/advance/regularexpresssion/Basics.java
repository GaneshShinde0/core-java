package com.ganesh.basic.advance.regularexpresssion;

public class Basics {
    // String methods which use regular expresssion.
    // matches(String regex) - boolean
    // replaceAll(String regex, String replacement) - String
    // replaceFirst(String regex, String replacement) - String
    // split(String regex)
    // split(String regex, int limit)

    public static void main(String[] args) {
        String helloWorld = "%s %s".formatted("Hello", "World");
        String helloWorldUsingFormat = String.format("Hello", "World");
        System.out.println("Using string's formatted method: "+helloWorld);
        System.out.println("Using String.format: "+helloWorldUsingFormat);
        System.out.println(format("%s %s","Hello","World"));


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
    }

    private static String format(String regexp, String... args){
        int index = 0;


//        while(regexp.matches(".*%s.*")){
//            regexp = regexp.replaceFirst("%s",args[index++]);
//        }

        while(regexp.contains("%s")){
            regexp = regexp.replaceFirst("%s",args[index++]);
        }
        return regexp;

    }
}
