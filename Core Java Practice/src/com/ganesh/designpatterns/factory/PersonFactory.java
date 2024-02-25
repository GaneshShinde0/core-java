package com.ganesh.designpatterns.factory;

public class PersonFactory {

    public static Person create(String message){
        Person p = null;
        if(message=="Male"){
            p = new Male();
        }else{
            p = new Female();
        }
        return p;
    }
}
