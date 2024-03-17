package com.ganesh.basic.advance.lists.linkedlists;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExamples {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        var otherPlacesToVisit = new LinkedList<String>();

        otherPlacesToVisit.add("Australia");
        otherPlacesToVisit.add("COCOMO");

        System.out.println(otherPlacesToVisit);
        addMoreElements(otherPlacesToVisit);

        System.out.println(otherPlacesToVisit);

        //removeElements(otherPlacesToVisit);
        System.out.println(otherPlacesToVisit);

        gettingElements(otherPlacesToVisit);
        System.out.println("###################");
        printItinerary(otherPlacesToVisit);
        System.out.println("###################");
        printItinerary3(otherPlacesToVisit);
        System.out.println("###################");
//        testIterator(otherPlacesToVisit);
        testListIterator(otherPlacesToVisit);
    }

    private static void addMoreElements(LinkedList<String> list) {
        list.addFirst("Monaco");
        list.addLast("Bahrain");

        // Query Methods
        list.offer("Dubai"); //At last
        list.offerFirst("Melbourne");
        list.offerLast("Tokyo");

        // Stack Methods
        list.push("Vegas"); //puts at head
    }

    private static void removeElements(LinkedList<String> list) {
        list.remove(4);
        list.remove("Vegas");

        System.out.println(list);
        // Removes first element
        String s1 = list.remove();
        System.out.println(s1 + "Was removed");

        // Removes first element
        String s2 = list.removeFirst();
        System.out.println(s2 + "Was removed");

        // Removes last element
        String s3 = list.removeLast();
        System.out.println(s3 + "Was removed");


        // Queue/Deque polls methods.
        String p1 = list.poll(); //removes first element
        System.out.println(p1 + " Was Removed");

        String p2 = list.pollFirst(); //removes first element
        System.out.println(p2 + " Was Removed");

        String p3 = list.pollLast(); //removes first element
        System.out.println(p3 + " Was Removed");


        // Pushes at begining
        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");

        System.out.println(list);
        String p4 = list.pop(); // Removes first element
        System.out.println(p4 + " Was Removed");


    }

    public static void gettingElements(LinkedList<String> list) {
        System.out.println("Retrieved Element = " + list.get(4));
        System.out.println("First Element = " + list.getFirst());
        System.out.println("Last Element = " + list.getLast());
        System.out.println("Darwin is at position: " + list.indexOf("Darwin"));
        System.out.println("Melbourne is at position: " + list.lastIndexOf("Melbourne"));
        // Queue Retrieval Method
        System.out.println("Element from element() = " + list.element());
        // Stack retrieval methods
        System.out.println("Element from peek() = " + list.peek());
        // Stack retrieval methods
        System.out.println("Element from peekFirst() = " + list.peekFirst());
        // Stack retrieval methods
        System.out.println("Element from peekLast() = " + list.peekLast());
    }

    public static void printItinerary(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        for (int i = 1; i < list.size(); i++) {
            System.out.println("--> From: " + list.get(i - 1) + " to " + list.get(i));
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary2(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        for (String town : list) {
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary3(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        ListIterator<String> iterator = list.listIterator(1);
        String previousTown = list.getFirst();
        while (iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    private static void testIterator(LinkedList<String> list) {
        var iterator = list.iterator();
        while (iterator.hasNext()) {
            //System.out.println(iterator.next());
            if (iterator.next().equals("Monaco")) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }

    private static void testListIterator(LinkedList<String> list) {
        var iterator = list.listIterator();
        while (iterator.hasNext()) {
            //System.out.println(iterator.next());
            if (iterator.next().equals("Monaco")) {
                iterator.add("Europe");
            }
        }

        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }
        System.out.println(list);
        var iterator2 = list.listIterator(3);
        System.out.println(iterator2.next());
    }
}
