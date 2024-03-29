package com.ganesh.basic.advance.debugging.testing.utilities;


public class Utilities {
    // Return a char array containing every nth char. Whe
    // sourceArray.length <n, return sourceArray
    public char[] everyNthChar(char[] sourceArray, int n) {
        if (sourceArray == null || sourceArray.length < n) {
            return sourceArray;
        }

        int returnedLength = sourceArray.length / n;
        char[] result = new char[returnedLength];
        int index = 0;

        for (int i = n - 1; i < sourceArray.length; i += n) {
            result[index++] = sourceArray[i];
        }
        return result;
    }

    // Removes pairs of same characters that are next to each other by removing occurence of the character.
    // "ABBCDEEF" -> "ABCDEF"
    public String removePairs(String source){
        if (source.length()<2){
            return source;
        }
        StringBuilder sb = new StringBuilder();
        char[] string = source.toCharArray();
        for(int i = 0; i<string.length-1; i++){
            if(string[i]!=string[i+1]){
                sb.append(string[i]);
            }
        }
        sb.append(string[string.length-1]);
        return sb.toString();
    }

    // Perform a conversion based on some business rule.
    public int convert(int a, int b){
        return (a/b) + (a*30) - 2;
    }

    public String nullIfOddLength(String source){
        if(source.length()%2==0){
            return source;
        }
        return null;
    }
}

