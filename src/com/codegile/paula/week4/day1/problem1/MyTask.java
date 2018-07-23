package com.codegile.paula.week4.day1.problem1;

public class MyTask implements Runnable {
    private String name;

    public MyTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.printf("Task %s is here\n", name);
    }
}
