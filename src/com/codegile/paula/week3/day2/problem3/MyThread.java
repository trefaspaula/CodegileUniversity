package com.codegile.paula.week3.day2.problem3;

public class MyThread extends Thread {
    private Thread nextThread;
    private String nameThread;
    private Integer position;

    public MyThread(Thread nextThread, String nameThread) {
        this.nextThread = nextThread;
        this.nameThread = nameThread;
        this.position = 1;
    }

    @Override
    public void run() {


        if (nextThread != null && position < 50) {
            nextThread.start();
            try {
                nextThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("Heloo %s\n", nameThread);
            position++;
        }


    }
}
