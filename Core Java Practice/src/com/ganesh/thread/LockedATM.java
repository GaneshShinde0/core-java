package com.ganesh.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockedATM {

    private Lock lock;
    private int balance = 100;

    public LockedATM() {
        lock = new ReentrantLock();
    }

    public int deposit(int money) {
        lock.lock();
        int temp = balance;

        try {
            Thread.sleep(100);
            temp = temp + money;
            Thread.sleep(120);
            balance = temp;
        } catch (InterruptedException exc) {
            System.out.println("Deposit Gave Exception");
        } finally {
            lock.unlock();
        }
        return temp;
    }

    public int withdraw(int money) {
        lock.lock();
        int temp = balance;

        try {
            Thread.sleep(100);
            temp = temp - money;
            Thread.sleep(120);
            balance = temp;
        } catch (InterruptedException exc) {
            System.out.println("Withdraw Gave Exception");
        } finally {
            lock.unlock();
        }
        return temp;
    }

    public static void main(String[] args) {
        LockedATM atm = new LockedATM();
        System.out.println("Initial Balance: " + atm.balance);

        Thread t1 = new Thread(() -> {
            System.out.println("Depositing 50: New Balance: " + atm.deposit(50));
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Withdrawing 30: New Balance: " + atm.withdraw(30));
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Final Balance: " + atm.balance);
    }
}
