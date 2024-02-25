package com.ganesh.dsa.sort;

import java.util.Arrays;

public class MergeSort {

    // Algorithm
    // Break list in half
    // Base case: when length(the_list) is 1
    // Use merge to join lists together
    public static void main(String[] args) {
        int[] array1 = {1,2,7,3,7,8,9,10};
        System.out.println(Arrays.toString(mergeSort(array1)));
    }

    public static int[] merge(int[] array1, int[] array2) {
        int[] combined = new int[array1.length + array2.length];
        int index = 0;
        int i = 0;
        int j = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                combined[index] = array1[i];
                index++;
                i++;
            } else {
                combined[index] = array2[j];
                index++;
                j++;
            }
        }

        while (i < array1.length) {
            combined[index] = array1[i];
            index++;
            i++;
        }
        while (j < array2.length) {
            combined[index] = array2[j];
            index++;
            j++;
        }
        return combined;
    }

    public static int[] mergeSort(int[] array){
        if (array.length == 1) return array;
        int midIndex = array.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(array, 0, midIndex));
        int[] right = mergeSort(Arrays.copyOfRange(array, midIndex, array.length));
        return merge((left), (right));
    }
}
