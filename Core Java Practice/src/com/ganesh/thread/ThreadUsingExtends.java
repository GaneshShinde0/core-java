package com.ganesh.thread;

class ThreadUsingExtendsThread extends Thread{
    int count =0;

    public void run(){
        System.out.println("Thread Started...");
        try{
            while(count<5){
                System.out.println(count);
                count++;
                Thread.sleep(500);
            }
        }catch(InterruptedException exc){
            exc.printStackTrace();
        }
        System.out.println("Thread is Terminating...");
    }
}

public class ThreadUsingExtends{
    public static void main(String[] args) {
        ThreadUsingExtendsThread thread = new ThreadUsingExtendsThread();
        thread.start();
        while(thread.count!=5){
            try{
                Thread.sleep(500);
            }catch(InterruptedException exc){
                exc.printStackTrace();
            }
        }
    }
}