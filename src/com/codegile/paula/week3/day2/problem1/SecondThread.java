package com.codegile.paula.week3.day2.problem1;

import java.util.Random;

public class SecondThread extends Thread {
    private String threadName;
    private Integer sleepTime;
    Random rand = new Random();

    public SecondThread(String name) {
        threadName = name;
        sleepTime = rand.nextInt(999);
    }

    @Override
    public void run() {
        System.out.printf("Thread %s is sleeping for %d milliseconds \n", threadName, sleepTime);

        try {
            System.out.println("Thread is active");
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
