package com.ganesh.dsa.extras.linkedlist;

public class AdditionalFunctions {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public AdditionalFunctions(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nDoubly Linked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void append (int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public void swapFirstLast(){
        if(length<2){
            return;
        }
        int temp = head.value;
        head.value=tail.value;
        tail.value=temp;

    }

    public void reverse(){
        if(length<1){
            return;
        }
        Node currentFront= head;
        Node currentEnd = tail;
        int i=0;
        while(i<length/2){
            int temp = currentFront.value;
            currentFront.value=currentEnd.value;
            currentEnd.value=temp;

            currentFront=currentFront.next;
            currentEnd=currentEnd.prev;
            i++;
        }
    }

    public boolean isPalindrome(){
        if(length<1){
            return true;
        }
        Node currentFront= head;
        Node currentEnd = tail;
        int i=0;
        while(i<length/2){
            if(currentFront.value!=currentEnd.value){
                return false;
            }
            currentFront=currentFront.next;
            currentEnd=currentEnd.prev;
            i++;
        }
        return true;
    }

    public void swapPairs() {
        if (head == null || head.next == null) // Check if the list is empty or has only one node
            return;

        Node current = head;

        while (current != null && current.next != null) {
            // Swap the values of current node and its next node
            int temp = current.value;
            current.value= current.next.value;
            current.next.value=temp;

            // Move to the next pair of nodes
            current = current.next.next;
        }
    }
}

