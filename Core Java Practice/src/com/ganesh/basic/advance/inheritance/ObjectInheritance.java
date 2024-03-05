package com.ganesh.basic.advance.inheritance;

public class ObjectInheritance extends Object{
    public static void main(String[] args) {
        Student max = new Student("Max",21);
        System.out.println(max);
    }
}

class Student{
    private String name;
    private int age;

    Student(String name, int age){
        this.age=age;
        this.name=name;
    }

    @Override
    public String toString() {
        // return super.toString();
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class PrimarySchoolStudent extends Student{
    private String parentName;

    PrimarySchoolStudent(String name, int age, String parentName){
        super(name,age);
        this.parentName = parentName;
    }
    @Override
    public String toString(){
        return parentName+"'s kid, "+super.toString();
    }

}