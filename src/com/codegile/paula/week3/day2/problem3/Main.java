package com.codegile.paula.week3.day2.problem3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Thread> threadList = new ArrayList<>();
        Thread nextThread = new Thread();
        for (int i = 49; i >= 0; i--) {
            Thread m;
            if (i == 49)
                m = new MyThread(null, "Thread" + i);
            else
                m = new MyThread(nextThread, "Thread" + i);
            threadList.add(m);
            nextThread = m;
            if (i == 0)
                m.start();
        }
    }
}
