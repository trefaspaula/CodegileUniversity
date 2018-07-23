package com.codegile.paula.week4.day1.problem1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        MyTaskFirst t1 = new MyTaskFirst("1");
        MyTaskFirst t2 = new MyTaskFirst("2");
        MyTaskFirst t3 = new MyTaskFirst("3");
        ExecutorService t = Executors.newFixedThreadPool(2);
        t.submit(t1);
        t.awaitTermination(3, TimeUnit.SECONDS);
        t.submit(t2);
        t.awaitTermination(3, TimeUnit.SECONDS);
        t.submit(t3);
        t.shutdown();

    }
}
