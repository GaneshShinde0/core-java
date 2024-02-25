package com.ganesh.dsa.binarysearchtree;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(123);
        bst.insert(12315);
        bst.insert(2883);
        bst.insert(2833);
        bst.insert(2283);
        bst.insert(1883);
        bst.insert(23);

        System.out.println(bst.root.right.value);

    }
}
