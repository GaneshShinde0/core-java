package com.ganesh.basic.advance.lambdaexpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    record Person(String firstName, String lastName){

        @Override
        public String toString(){
            return firstName+" "+lastName;
        }
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(Arrays.asList(
                new Main.Person("Lucy", "Van Pelt"),
                new Main.Person("Sally", "Brown"),
                new Main.Person("Linus", "Torvalds"),
                new Main.Person("Beck", "Von"),
                new Person("Charlie", "Sheen")
        ));

        // Using anonymous class
        var comparatorLastName = new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.lastName().compareTo(o2.lastName());
            }
        };

        people.sort(comparatorLastName);
        System.out.println(people);

        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.lastName().compareTo(o2.lastName());
            }
        });
        System.out.println(people);

        people.sort((o1, o2) -> o1.firstName().compareTo(o2.firstName()));
        System.out.println(people);

        people.sort(Comparator.comparing(Person::firstName));
        System.out.println(people);

        interface EnhancedComparator<T> extends Comparator<T> {
            int secondLevel(T o1, T o2);
        }

        var comparatorMixed = new EnhancedComparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.lastName().compareTo(o2.lastName());
                return result == 0 ? secondLevel(o1, o2) : result;
            }

            @Override
            public int secondLevel(Person o1, Person o2) {
                return 0;
            }
        };

        people.sort(comparatorMixed);
        System.out.println(people);

    }
}
