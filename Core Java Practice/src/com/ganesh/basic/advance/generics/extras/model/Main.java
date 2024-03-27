package com.ganesh.basic.advance.generics.extras.model;

import com.ganesh.basic.advance.generics.multipleupperb.QueryItem;
import com.ganesh.basic.advance.generics.multipleupperb.QueryList;

import java.util.ArrayList;
import java.util.List;

record Employee(String name) implements QueryItem {

    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        return false;
    }
}
public class Main {

    public static void main(String[] args){
        int studentCount = 10;
        List<Student> students = new ArrayList<>();
        for(int i = 0; i<studentCount; i++){
            students.add(new Student());
        }
        students.add(new SmartStudent());
//        printList(students);
        printMoreLists(students);

        List<SmartStudent> smartStudents = new ArrayList<>();
        for(int i = 0; i<studentCount; i++){
            smartStudents.add(new SmartStudent());
        }
//        printList(smartStudents);
        printMoreLists(smartStudents);

        testList(new ArrayList<String>(List.of("Able","Barry","brian")));
        testList(new ArrayList<Integer>(List.of(1,2,324)));

        var queryList = new QueryList<>(smartStudents);
        var matches  = queryList.getMatches("Course","Python");
        printMoreLists(matches);

        var students2022 = QueryList.getMatches(students, "YearStarted","2022");
        printMoreLists(students2022);

//        QueryList<Employee> employeeList = new QueryList<>();
    }

    private static  void printMoreLists(List<? extends Student> students) {
        for(var student:students){
            System.out.println(student.getYearStarted()+": "+student);
        }
        System.out.println();
    }

    public static void testList(List<?> list){
        for(var element: list){
            if (element instanceof String s) {
                System.out.println("String: " + s.toUpperCase());
            }else if (element instanceof Integer i){
                System.out.println("Integer: " + i.floatValue());
            }

        }
    }
//    public static void testList(List<String> list){
//        for(var element: list){
//            System.out.println("String: "+ element.toUpperCase());
//        }
//    }
//    public static void testList(List<Integer> list){
//        for(var element: list){
//            System.out.println("String: "+ element.floatValue());
//        }
//    }
//    private static <T extends Student> void printList(List<T> students) {
//        for(var student:students){
//            System.out.println(student.getYearStarted()+": "+student);
//        }
//        System.out.println();
//    }
}

