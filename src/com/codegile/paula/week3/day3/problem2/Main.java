package com.codegile.paula.week3.day3.problem2;

import java.util.concurrent.Semaphore;

public class Main {
    public static final int MAX_CARS = 5;
    static Semaphore parking = new Semaphore(MAX_CARS, true);

    public static void main(String[] args) {
        Thread t1 = new Car("a");
        Thread t2 = new Car("b");
        Thread t3 = new Car("c");
        Thread t4 = new Car("d");
        Thread t5 = new Car("e");
        Thread t6 = new Car("f");
        Thread t7 = new Car("g");
        Thread t8 = new Car("h");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
    }
}
