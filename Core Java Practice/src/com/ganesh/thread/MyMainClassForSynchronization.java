package com.ganesh.thread;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class MyClassForSynchronization extends Thread {

    private String name;
    private MyObject myObj;

    public MyClassForSynchronization(MyObject obj, String name){
        this.name=name;
        this.myObj=obj;
    }

    public void run(){
        //myObj.foo(name);

        if(name.equals("1")) MyObject.foo(name);
        else if (name.equals("2")) MyObject.bar(name);
    }
}

class MyObject{


    public synchronized void zero(String name){
        // Object Specific
        try{
            System.out.println("Thread "+name+" zero(): starting");
            Thread.sleep(500);
            System.out.println("Thread "+name+" zero(): ending");
        }catch(InterruptedException exc){
            System.out.println("Thread "+name+": Interrupted");
        }
    }

    public static synchronized void foo(String name){
        try{
            System.out.println("Thread "+name+" foo(): starting");
            Thread.sleep(500);
            System.out.println("Thread "+name+" foo(): ending");
        }catch(InterruptedException exc){
            System.out.println("Thread "+name+": Interrupted");
        }
    }

    public static synchronized void bar(String name){
        try{
            System.out.println("Thread "+name+" bar(): starting");
            Thread.sleep(500);
            System.out.println("Thread "+name+" bar(): ending");
        }catch(InterruptedException exc){
            System.out.println("Thread "+name+": Interrupted");
        }
    }


    public void baz(String name){
        synchronized(this){
            try{
                System.out.println("Thread "+name+" foo(): starting");
                Thread.sleep(500);
                System.out.println("Thread "+name+" foo(): ending");
            }catch(InterruptedException exc){
                System.out.println("Thread "+name+": Interrupted");
            }
        }
    }
}

public class MyMainClassForSynchronization{

    public static void main(String[] args){
        MyObject obj1 = new MyObject();
        MyObject obj2 = new MyObject();

        MyClassForSynchronization thread1 = new MyClassForSynchronization(obj1,"1");
        MyClassForSynchronization thread2 = new MyClassForSynchronization(obj2,"2");

        thread1.start();
        thread2.start();
    }
}