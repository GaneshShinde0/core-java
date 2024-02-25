package com.ganesh.basic.advance.arrays;

import java.util.Arrays;
import java.util.Random;

public class SortArrays {

    public static void main(String[] args) {
        int[] arr = getRandomArray(10);
        // arr.toString() will give Ojbect@HexadecimalAddress
        System.out.println(sortIntegers(arr));
        System.out.println(sortIntegers(arr).toString());
        System.out.println(Arrays.toString(sortIntegers(arr)));
    }

    // Bubble Sort
    private static int[] sortIntegers(int[] array){
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;

        while(flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    private static int[] getRandomArray(int len){

        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i<len; i++){
            newInt[i] = random.nextInt(100); // Returns random value from 0 to 99
        }
        return newInt;
    }
}
