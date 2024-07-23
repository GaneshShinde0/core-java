package com.ganesh.thread;

public class ThreadWithRunnable implements Runnable{
    public static void main(String[] args) {
        ThreadWithRunnable runnableExample = new ThreadWithRunnable();
        Thread thread = new Thread(runnableExample);
        thread.start();
        int count=0;
        try{
            while(count<5){

                thread.sleep(100);
            }
        }catch(InterruptedException exc){
            exc.printStackTrace();
        }
    }

    private int count =0;

    public void run(){
        System.out.println("Runnable Thread Started");
        try{
            while(count<5){
                System.out.println(count);
                count++;
                Thread.sleep(500);
            }
        }catch(InterruptedException exc){
            exc.printStackTrace();
        }
    }
}