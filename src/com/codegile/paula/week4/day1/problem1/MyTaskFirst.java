package com.codegile.paula.week4.day1.problem1;

public class MyTaskFirst implements Runnable {
    private String name;

    public MyTaskFirst(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.print(Thread.currentThread().getName() + "--------->");
        System.out.printf("Task %s is here\n", name);
    }
}
