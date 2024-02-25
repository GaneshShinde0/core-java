package com.ganesh.designpatterns.singleton;

import java.io.Serializable;

public class LoggerSingleton implements Serializable {
    public static volatile LoggerSingleton instance;
    private LoggerSingleton(){

    }
    public static LoggerSingleton getInstance(){
        if(instance==null){
            {
                synchronized(LoggerSingleton.class){
                    if(instance == null){
                        instance = new LoggerSingleton();
                    }
                }
            }
        }
        return instance;
    }

    public void log(String message){
        System.out.println(message);
    }

    public Object readResolve(){
        return instance;
    }
}


