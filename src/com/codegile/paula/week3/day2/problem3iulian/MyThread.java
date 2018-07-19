package com.codegile.paula.week3.day2.problem3iulian;

public class MyThread extends Thread {
    String threadName;
    MyThread previousThread;

    public MyThread(String threadName, MyThread previousThread) {
        this.threadName = threadName;
        this.previousThread = previousThread;
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    public void setPreviousThread(MyThread previousThread) {
        this.previousThread = previousThread;
    }

    @Override
    public void run() {
        System.out.println("Hello " + threadName);
        try {
            if (previousThread != null) {
                previousThread.join();
                previousThread.start();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
