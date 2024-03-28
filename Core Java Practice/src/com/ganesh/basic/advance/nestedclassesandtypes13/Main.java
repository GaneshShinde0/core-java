package com.ganesh.basic.advance.nestedclassesandtypes13;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(new Employee(101, "Test 1", 2016), new Employee(102, "Test 2", 2018), new Employee(103, "Test 3", 2024), new Employee(105, "Jane", 2017), new Employee(104, "John", 2019)));

//        var comparator = new EmployeeComparator<>();
//        employees.sort(comparator);

        employees.sort(new Employee.EmployeeComparator<>("yearStarted").reversed());

        for (Employee e : employees) {
            System.out.println(e);
        }

        System.out.println("Store Members");
        List<InnerClassExamplesStoreEmployee> storeEmployees = new ArrayList<>(List.of(new InnerClassExamplesStoreEmployee(1001, "Tom", 2020, "Destination"), new InnerClassExamplesStoreEmployee(1002, "Henry", 2015, "Hills"), new InnerClassExamplesStoreEmployee(1003, "Zack", 2023, "Arby's"), new InnerClassExamplesStoreEmployee(1004, "Alfred", 2018, "Bat Cave"), new InnerClassExamplesStoreEmployee(1005, "Robin", 2023, "Wayne Enterprises")));

        for (InnerClassExamplesStoreEmployee e : storeEmployees) {
            System.out.println(e);
        }
        System.out.println("#############################");
        var comparator = new InnerClassExamplesStoreEmployee.EmployeeComparator<>();
        storeEmployees.sort(comparator);
        for (InnerClassExamplesStoreEmployee e : storeEmployees) {
            System.out.println(e);
        }

        // To create an instance of an inner class, you first ust have an instance of the Enclosing Class.

        // EnclosingClass outerClass = new EnclosingClass();
        // EnclosingClass.InnerClass innerClass = outerClass.new InnerClass();

        InnerClassExamplesStoreEmployee outerClass = new InnerClassExamplesStoreEmployee();
        InnerClassExamplesStoreEmployee.StoreComparator innerClass = outerClass.new StoreComparator();

        System.out.println("With Pig Latin Names");
        addPigLatinName(storeEmployees);
    }

    public static void addPigLatinName(List<? extends InnerClassExamplesStoreEmployee> list) {

        String lastName = "Piggy";

        class DecoratedEmployee extends InnerClassExamplesStoreEmployee implements Comparable<DecoratedEmployee> {
            private final String pigLatinName;
            private final Employee originalInstance;

            public DecoratedEmployee(String pigLatinName, Employee originalInstance) {
                this.pigLatinName = pigLatinName + " " + lastName;
                this.originalInstance = originalInstance;
            }

            @Override
            public String toString() {
                return originalInstance.toString() + " " + pigLatinName;
            }

            @Override
            public int compareTo(DecoratedEmployee o) {
                return pigLatinName.compareTo(o.pigLatinName);
            }
        }

        List<DecoratedEmployee> newList = new ArrayList<>(list.size());
        for (var employee : list) {
            String name = employee.getName();
            String pigLatin = name.substring(1) + name.charAt(0) + "ay";
            newList.add(new DecoratedEmployee(pigLatin, employee));
        }

        newList.sort(null); // If we pass null it will use comparables comparator.
        for (var dEmployee : newList) {
            System.out.println(dEmployee.originalInstance.getName() + " " + dEmployee.pigLatinName);
            //System.out.println(dEmployee);
        }
    }
}
