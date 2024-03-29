package com.ganesh.basic.advance.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReveseArray {
    public static void main(String[] args) {

        int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));

        reverse(returnedArray);
        System.out.println("Final: " + Arrays.toString(returnedArray));
    }

    private static int[] readIntegers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas: ");
        String input = sc.nextLine();
        String[] splits = input.split(",");
        int[] values = new int[splits.length];
        for (int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].strip());
        }
        return values;
    }
    private static void reverse(int[] array){
        int maxIndex = array.length -1;
        int halflength = array.length/2;

        for(int i =0;i<halflength; i++){
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i]=temp;

        }
    }


}
