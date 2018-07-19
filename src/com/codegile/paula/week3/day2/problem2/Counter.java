package com.codegile.paula.week3.day2.problem2;

public class Counter implements Runnable {
    private Integer var;

    public Integer getVar() {
        return var;
    }

    public Counter() {
        var = 0;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                System.out.println(var);
                var++;
                Thread.sleep(999);
            }
        } catch (InterruptedException e) {

        }
    }
}


