package com.ganesh.basic.advance.generics.comparable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Integer five = 5;
        Integer[] others = {0,5,10,-50,50};

        for(Integer i: others){
            int val = five.compareTo(i);
            System.out.printf("%d %s %d: compareTo=%d%n", five,
                    (val == 0 ? "==":(val<0)?"<":">"), i, val);
            /*
            5 > 0: compareTo=1
            5 == 5: compareTo=0
            5 < 10: compareTo=-1
            5 > -50: compareTo=1
            5 < 50: compareTo=-1
             */
        }
        String banana = "banana";
        String[] fruit = {"apple", "banana", "pear", "BANANA"};
        for (String s: fruit){
            int val = banana.compareTo(s);
            System.out.printf("%s %s %s: compareTo = %d%n", banana,
                    (val==0?"==":(val<0)?"<":">"), s, val);
            /*
            banana > apple: compareTo = 1
            banana == banana: compareTo = 0
            banana < pear: compareTo = -14
            banana > BANANA: compareTo = 32
             */
        }
        Arrays.sort(fruit);
        System.out.println(Arrays.toString(fruit));

        System.out.println("A:"+(int)'A'+" "+ "a:"+(int)'a');
        System.out.println("Z:"+(int)'Z'+" "+ "z:"+(int)'z');
        System.out.println((char)96);


        Student tim = new Student("Tim");
        Student[] students = {new Student("Zach"), new Student("Tom"), new Student("Annie"), new Student("Zeke")};

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        System.out.println("result = "+tim.compareTo(new Student("Mary")));

        Comparator<Student> gpaSorter = new StudentGPAComparator();
        Arrays.sort(students, gpaSorter.reversed());
        System.out.println(Arrays.toString(students));
    }
}

class StudentGPAComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return (o2.gpa+o2.getName()).compareTo(o1.gpa+o1.getName());
    }
}
class Student implements Comparable<Student>{

    private static int LAST_ID = 1000;
    private static Random random = new Random();

    private String name;

    private int id;
    protected double gpa;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  "%d - %s (%.2f)".formatted(id, name, gpa) ;
    }

    public Student(String name) {
        this.name = name;
        id = LAST_ID++;
        gpa = random.nextDouble(1.0,4.0);
    }

    @Override
    public int compareTo(Student o) {
        return Integer.valueOf(id).compareTo(Integer.valueOf(o.id));
    }
}