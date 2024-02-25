package com.ganesh.dsa.heaps;

public class Main {

    public static void main(String[] args) {

        Heap myHeap = new Heap();
        myHeap.insert(123);
        myHeap.insert(37);
        myHeap.insert(28);
        myHeap.insert(3284);
        myHeap.insert(2);

        System.out.println(myHeap.getHeap());
        myHeap.insert(1232);

    }
}
