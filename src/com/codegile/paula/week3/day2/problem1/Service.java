package com.codegile.paula.week3.day2.problem1;

public class Service {
    public static void main(String[] args) {
        Thread tt1 = new Thread(new FirstThread("one"));
        Thread tt2 = new Thread(new FirstThread("two"));
        Thread tt3 = new Thread(new FirstThread("three"));

        SecondThread tt4 = new SecondThread("four");
        SecondThread tt5 = new SecondThread("five");
        SecondThread tt6 = new SecondThread("six");

        tt1.start();
        tt2.start();
        tt3.start();
        tt4.start();
        tt5.start();
        tt6.start();

    }

    public static class Main {
    }
}
