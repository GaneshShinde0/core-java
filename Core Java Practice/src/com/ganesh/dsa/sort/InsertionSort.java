package com.ganesh.dsa.sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {123, 23, 345, 199, 283, 34};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insertionSort(int[] array){
        for(int i =1; i<array.length; i++){
            int temp = array[i];
            int j = i-1;
            while(j>-1 && temp<array[j]){
                array[j+1] = array[j];
                array[j]=temp;
                j--;
            }
        }
    }
}
