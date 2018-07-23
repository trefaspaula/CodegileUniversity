package com.codegile.paula.week3.day2.problem3;

public class MyThread extends Thread {
    private Thread nextThread;
    private String nameThread;

    public MyThread(Thread nextThread, String nameThread) {
        this.nextThread = nextThread;
        this.nameThread = nameThread;
    }

    @Override
    public void run() {


        if (nextThread != null) {
            nextThread.start();
            try {
                nextThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("Heloo %s\n", nameThread);
        }


    }
}
