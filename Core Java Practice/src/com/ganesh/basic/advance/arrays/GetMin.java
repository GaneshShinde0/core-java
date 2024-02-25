package com.ganesh.basic.advance.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class GetMin {

    public static void main(String[] args) {
         int[] returedArray = readIntegers();
         System.out.println(Arrays.toString(returedArray));

         int returnedMin = findMin(returedArray);
         System.out.println("min = "+returnedMin);

    }

    private static int[] readIntegers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas: ");
        String input = sc.nextLine();
        String[] splits = input.split(",");
        int[] values = new int[splits.length];
        for (int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i]);
        }
        return values;
    }

    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for(int t: array){
            if (t<min){
                min = t;
            }
        }
        return min;
    }
}
