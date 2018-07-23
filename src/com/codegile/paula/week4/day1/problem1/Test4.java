package com.codegile.paula.week4.day1.problem1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Test4 {
    public static void main(String[] args) throws IOException {
        MyTaskFirst t1 = new MyTaskFirst("1");
        ScheduledExecutorService t = Executors.newScheduledThreadPool(2);
        t.scheduleWithFixedDelay(t1, 3, 2, TimeUnit.SECONDS);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        if (bf.read() == '\n') {
            t.shutdown();
        }
    }
}
