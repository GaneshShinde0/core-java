package com.ganesh.designpatterns.factory;

public class Test {

    public static void main(String[] args){
        Person p = PersonFactory.create("Male");
        p.wish("Hello!");
    }
}
