package com.ganesh.dsa.sort;

import java.util.Arrays;

public class QuickSort {


    // Time Complexity of Quick Sort is n.log(n)
    // When array is already sorted QuickSort takes O(n.n)
    // Its better to use insertion sort in that case.
    public static void main(String[] args){
        int[] array1 = {1,2,7,3,7,8,9,10};
        quickSort(array1, 0, array1.length-1);
        System.out.println(Arrays.toString(array1));
    }

    public static int pivot(int[] array, int pivotIndex, int endIndex){
        int swapIndex = pivotIndex;
        for (int i = pivotIndex +1; i<=endIndex;i++){
            if (array[i]<array[pivotIndex]){
                swapIndex++;
                swap(array, swapIndex, i);
            }
        }
        swap(array, pivotIndex, swapIndex);
        return swapIndex;
    }
    public static void swap(int[] array, int firstIndex, int secondIndex){
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    public static void quickSort(int[] array, int left, int right){
        if (left<right) {
            int pivotIndex = pivot(array, left, right);
            quickSort(array, left, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, right);
        }
    }
}
