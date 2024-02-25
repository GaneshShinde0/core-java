package com.ganesh.others;

public class ReverseVowels {
    
    // Function to check if a character is a vowel
    public static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
    
    // Function to reverse vowels in a string
    public static String reverseVowels(String str) {
        char[] charArray = str.toCharArray();
        int i = 0;
        int j = str.length() - 1;
        
        while (i < j) {
            // Move 'i' to the next vowel
            while (i < j && !isVowel(charArray[i])) {
                i++;
            }
            // Move 'j' to the previous vowel
            while (i < j && !isVowel(charArray[j])) {
                j--;
            }
            // Swap vowels
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            
            // Move to the next pair
            i++;
            j--;
        }
        
        return new String(charArray);
    }
    
    // Main method to test the function
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Original string: " + str);
        String reversed = reverseVowels(str);
        System.out.println("String with reversed vowels: " + reversed);
    }
}
