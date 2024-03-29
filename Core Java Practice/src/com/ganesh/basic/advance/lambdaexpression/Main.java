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
                new Main.Person("Lucy","Van Pelt"),
                new Main.Person("Sally","Brown"),
                new Main.Person("Linus","Torwalds"),
                new Main.Person("Beck","Von"),
                new Main.Person("Charlie","Sheen")
        ));

        // Using anonymous class
        var comparatorLastName = new Comparator<Person>(){

            @Override
            public int compare(Person o1, Person o2) {
                return o1.lastName().compareTo(o2.lastName());
            }
        };

        people.sort(comparatorLastName);
        System.out.println(people);

        people.sort((o1,o2)->o1.firstName().compareTo(o2.firstName()));
        System.out.println(people);
    }
}
