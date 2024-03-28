package com.ganesh.basic.advance.nestedclassesandtypes13.anonymous;

import com.ganesh.basic.advance.nestedclassesandtypes13.Employee;
import com.ganesh.basic.advance.nestedclassesandtypes13.StoreEmployee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RunMethods {

    public static void main(String[] args) {
        List<StoreEmployee> storeEmployees =
                new ArrayList<>(List.of(new StoreEmployee(1001, "Tom", 2020, "Destination"),
                        new StoreEmployee(1002, "Henry", 2015, "Hills"),
                        new StoreEmployee(1003, "Zack", 2023, "Arby's"),
                        new StoreEmployee(1004, "Alfred", 2018, "Bat Cave"),
                        new StoreEmployee(1005, "Robin", 2023, "Wayne Enterprises")));

        var c0 = new Employee.EmployeeComparator<StoreEmployee>();
        var c1 = new StoreEmployee().new StoreComparator<StoreEmployee>();
        var c2 = new StoreEmployee().new StoreComparator<StoreEmployee>();

        class NameSort<T> implements Comparator<StoreEmployee>{
            @Override
            public int compare(StoreEmployee o1, StoreEmployee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        var c3 = new NameSort<StoreEmployee>();

        // Using Anonymous class
        var c4 = new Comparator<StoreEmployee>(){
            @Override
            public int compare(StoreEmployee o1, StoreEmployee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        sortIt(storeEmployees, c0);
        sortIt(storeEmployees, c1);
        sortIt(storeEmployees, c2);
        sortIt(storeEmployees, c3);
        sortIt(storeEmployees, c4);
//        sortIt(storeEmployees, new Comparator<StoreEmployee>(){
//            @Override
//            public int compare(StoreEmployee o1, StoreEmployee o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

        sortIt(storeEmployees, (o1, o2) -> o1.getName().compareTo(o2.getName()));
    }

    public static<T> void sortIt(List<T> list, Comparator<? super T> comparator){
        System.out.println("Sorting with Comparator: "+ comparator.toString());
        list.sort(comparator);
        for(var employee: list){
            System.out.println(employee);
        }
    }
}
