package com.ganesh.basic.advance.arrays;

public class BasicsOfArray {

    public static void main(String[] args) {

        int[] myIntArray = new int[10];
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2]= 3.5;

        System.out.println(myDoubleArray[2]);

        int[] arrayUsingArrayInitializer = new int[]{1,2,4,9,10};

        // Anonymous array can be used only in declaration statement.
        int[] arrayUsingAnonymousArray = {1,2,3,4,5};
        String[] arrayOfStringUsingAnonymousArray = {"First","Second","Third"};

        System.out.println("Length of array = "+ arrayUsingAnonymousArray.length);

        int[] newArray;
        // Following is not allowed
        // newArray = {1,2,3};
        newArray = new int[]{1,2,3,4,5};

        for(int element: newArray){
            System.out.print(element+" ");
        }

        // Following prints object of array.
        System.out.println(newArray);

        // Arrays has single property or field, named length.

        System.out.println(newArray.toString());

        Object objectVariable = newArray;
        if(objectVariable instanceof int[]){
            System.out.println("Object Variable is really a int array");
        }

        Object[] objectArray = new Object[3];
        objectArray[0] = "Normal String";
        objectArray[1] = new StringBuilder("String Builder String");
        objectArray[2] = newArray;
    }
}
