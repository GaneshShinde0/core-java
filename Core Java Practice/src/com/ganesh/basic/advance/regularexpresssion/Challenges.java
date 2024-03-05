package com.ganesh.basic.advance.regularexpresssion;

public class Challenges {

    public static void main(String[] args) {
        String sentence = "Hello, World!";
        boolean matches = matchesHelloWorld("Hello, World!");
        System.out.println(matches);

        sentence = "Aasdfa.";
        System.out.println(matchesAaEndPeriod(sentence));

        String[] testSentences = {
                "This is a valid sentence.",
                "another sentence with a period.",
                "Sentence with a question mark?",
                "sentence with an exclamation mark!",
                "invalid sentence"
        };

        for (String sent : testSentences) {
            System.out.println("Sentence: " + sent + " - Matches? " + matchesSentence(sent));
        }
    }
    public static boolean matchesHelloWorld(String input){
        return "Hello, World!".matches(input);
    }

    public static boolean matchesAaEndPeriod(String input){
        return "[A-Z].*\\.$".matches(input);
        // "[A-Z][a-z\\s]\\." will work same.
        //               +[.]" will work as well.
    }

    public static boolean matchesSentence(String input){
        return "[A-Z].+[.?!]".matches(input);
        // "^[A-Z][\\p{all}]+[.?!]$"
        // "[A-Z].*\\p{Punct}$".matches(input);
        // "[A-Z][a-z\\s]\\." will work same.
        //               +[.]" will work as well.
    }
}
