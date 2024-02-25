package com.ganesh.streams;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharsExample {
    public static void main(String[] args) {
        String inputString = "programming";

        Map<Character, Long> charCountMap = findDuplicateChars(inputString);

        System.out.println("Duplicate characters in the string:");
        charCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue() + " times"));
    }

    private static Map<Character, Long> findDuplicateChars(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
