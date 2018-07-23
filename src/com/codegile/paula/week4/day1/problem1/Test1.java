package com.codegile.paula.week4.day1.problem1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test1 {
    public static void main(String[] args) {
        MyTask t1 = new MyTask("1");
        MyTask t2 = new MyTask("2");
        MyTask t3 = new MyTask("3");
        ExecutorService s = Executors.newSingleThreadExecutor();
        s.submit(t1);
        s.submit(t2);
        s.submit(t3);
        s.shutdown();
    }
}
