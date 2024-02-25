package com.ganesh.basic.advance.inheritance;

public class TheRecordClass {

    // The record was introduced in JDK 14 and became officially part of java in JDK 16.
    // The record is a special class that contains data, that's not meant to be altered.
    // In other words it seeks to achieve immutability, for the data in its members.
    // It contains only the most fundamental methods, such as constructors and accessors.
    // Best of all, you the developer, don't have to write or generate any of this code..
    // Implicit or Generated COde that Java provides.
    // What des java tell us about what is implicitly created, when we declare a record as we did in this code?
    // public record RecordOfStudent(String id, String name, String dateOfBirth, String classList) {}
    // First, its important to understand that the part that's in parentheses, is called the record header.

    // For each component in the header, Java generates:
    // A field with the same name and declared type as the record component.
    // The field is declared private and final.
    // The field is sometimes referred to as a component field.

    // Java also generated toString.
    // In addition to creating a private final field for each component, java generates a public accessor method for each component.
    // This method has the same name and type of the component, but it doesn't have any kind of special prefix, no get, or is for example.
    // The accessor method, for id in this example, is simply id()

    public static void main(String[] args) {
        // The record is immutable.
        // Why have an immutable record?
        // There are more use cases for immutable data transfer objects, and keeping them well encapsulated.
        // You want to protect data from unwanted immutations.
        RecordOfStudent recordStudent = new RecordOfStudent("12342","Ganesh","01/01/1970","Master Chief");

        System.out.println(recordStudent);
        System.out.println(recordStudent.name() + " is taking "+recordStudent.classList());

    }
}
