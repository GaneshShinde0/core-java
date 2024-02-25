package com.ganesh.dsa.sort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {123, 23, 345, 199, 283, 034};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void selectionSort(int[] array) {

        for(int i=0; i<array.length;i++){
            int minIndex=i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[minIndex]){
                    minIndex=j;
                }
            }
            if(i!=minIndex) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
}
