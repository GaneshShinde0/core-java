package com.ganesh.basic.advance.controlflow;

public class LargestPrimeFactors {
    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }

        while (number % 2 == 0) {
            number /= 2;
        }

        if (number == 1) {
            return 2;
        }

        int largestPrime = -1;
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                largestPrime = i;
                number /= i;
            }
        }

        if (number > 2) {
            largestPrime = number;
        }

        return largestPrime;
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));  // Output: 7
        System.out.println(getLargestPrime(217)); // Output: 31
        System.out.println(getLargestPrime(0));   // Output: -1
        System.out.println(getLargestPrime(45));  // Output: 5
        System.out.println(getLargestPrime(-1));  // Output: -1
        System.out.println(getLargestPrime(2070));  // Output: -1
    }
}
