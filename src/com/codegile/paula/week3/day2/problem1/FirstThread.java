package com.codegile.paula.week3.day2.problem1;

import java.util.Random;

public class FirstThread implements Runnable {
    private String threadName;
    private Integer sleepTime;
    Random rand = new Random();

    public FirstThread(String name) {
        threadName = name;
        sleepTime = rand.nextInt(999);
    }

    @Override
    public void run() {
        System.out.printf("Thread %s is spleeping for %d milliseconds\n", threadName, sleepTime);
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Thread %s is active \n", threadName);
    }
}
