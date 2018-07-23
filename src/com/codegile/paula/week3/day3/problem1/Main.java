package com.codegile.paula.week3.day3.problem1;

import java.util.concurrent.Semaphore;

public class Main {
    static Semaphore s = new Semaphore(5, true);

    public static void main(String[] args) {
        Thread t1 = new MyThread("a");
        Thread t2 = new MyThread("b");
        Thread t3 = new MyThread("c");
        Thread t4 = new MyThread("d");
        Thread t5 = new MyThread("e");
        Thread t6 = new MyThread("f");
        Thread t7 = new MyThread("g");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();

    }
}
