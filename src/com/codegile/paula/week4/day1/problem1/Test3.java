package com.codegile.paula.week4.day1.problem1;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Test3 {
    public static void main(String[] args) {
        MyTaskFirst t1 = new MyTaskFirst("1");
        MyTaskFirst t2 = new MyTaskFirst("2");
        MyTaskFirst t3 = new MyTaskFirst("3");
        ScheduledExecutorService t = Executors.newScheduledThreadPool(2);
        t.schedule(t1, 3, TimeUnit.SECONDS);
        t.schedule(t2, 6, TimeUnit.SECONDS);
        t.schedule(t3, 9, TimeUnit.SECONDS);
        t.shutdown();

    }
}
