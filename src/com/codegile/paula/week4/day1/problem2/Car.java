package com.codegile.paula.week4.day1.problem2;

public class Car implements Runnable {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " is inside");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " is out");
    }
}
