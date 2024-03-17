package com.ganesh.basic.advance.collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String > list = new ArrayList<>();
//        Collection<String > list = new TreeSet<>();
//        Collection<String > list = new HashSet<>();

        String[] names= {"ASDF","Noel","Carol","Danny","Tom","Zoro"};
        list.addAll(Arrays.asList(names));
        System.out.println(list);

        list.add("Fred");
        list.addAll(Arrays.asList("asdf","Mike","Leo"));
        System.out.println(list);
        System.out.println("Mike is in the list? "+list.contains("Mike"));

        list.removeIf(s->s.charAt(0)=='M');
        System.out.println(list);
        System.out.println("Mike is in the list? "+list.contains("Mike"));


    }
}
