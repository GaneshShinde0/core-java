package com.ganesh.basic.advance.nestedclassesandtypes13;

import java.util.Comparator;

public class InnerClassExamplesStoreEmployee extends Employee {

    // Inner classes are non-static classes, declared on an enclosing class, at the member level.
    // Inner classes have any of the four valid access modifiers.
    // Inner classes have access to instance members, including private members, of the enclosing class.
    // Instantiating an inner class from external code is a bit tricky.
    // As of JDK16, static members of all types are supported on inner class.

    private String store;

    public InnerClassExamplesStoreEmployee() {
    }

    public InnerClassExamplesStoreEmployee(int employeeId, String name, int yearStarted, String store) {
        super(employeeId, name, yearStarted);
        this.store = store;
    }

    public class StoreComparator<T extends InnerClassExamplesStoreEmployee> implements Comparator<InnerClassExamplesStoreEmployee> {

        @Override
        public int compare(InnerClassExamplesStoreEmployee o1, InnerClassExamplesStoreEmployee o2) {
            int result = o1.store.compareTo(o2.store);
            if (result == 0) {
                return new Employee.EmployeeComparator<>("yearStarted").compare(o1, o2);
            }
            return result;
        }
    }

    @Override
    public String toString() {
        return "%-8s%s".formatted(store,super.toString());
    }
}


